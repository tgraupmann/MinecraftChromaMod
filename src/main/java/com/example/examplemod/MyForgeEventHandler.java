package com.example.examplemod;

import com.razer.java.JAppInfoType;
import com.razer.java.JChromaSDK;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateHolder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.loading.targets.FMLServerDevLaunchHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MyForgeEventHandler extends ChromaEffects {

	private class PlayerState {
		public boolean mAlive = true;
		public boolean mInAir = false;
		public boolean mOnGround = true;
		public boolean mOnLadder = false;
		public boolean mInLava = false;
		public boolean mInWater = false;
		public boolean mInMinecart = false;
		public boolean mIsRaining = false;
		public boolean mIsSnowing = false;
		public BlockPos mPosition = BlockPos.ZERO;
	}

	private PlayerState mPlayerState = new PlayerState();

	List<String> mEvents = new ArrayList<String>();

	private boolean mChromaInitialized = false;

	private List<TimerTask> sChromaTasks = new ArrayList<TimerTask>();

	private boolean mWaitForExit = true;

	private void logMessage(String msg) {
		System.out.println(msg);
	}
	
	private void logError(String msg) {
		System.err.println(msg);
	}

	private void addChromaTask(TimerTask task) {
		sChromaTasks.add(task);
	}

	private void setupChromaThread() {
		mWaitForExit = true;
		Timer timer = new Timer("Timer");
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					while (mWaitForExit) {
						if (sChromaTasks.size() > 0) {
							TimerTask nextTask = sChromaTasks.get(0);
							sChromaTasks.remove(0);
							try {
								if (nextTask != null) {
									nextTask.run();
								}
							} catch (Exception e) {
								logError("Exception running Chroma Task!");
								e.printStackTrace();										
							}
							
						}
						try {
							Thread.sleep(0);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		timer.schedule(task, 0);
	}

	public void register() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void init() {
		
		if (sChromaAnimationAPI == null) {
		
			sChromaAnimationAPI = JChromaSDK.getInstance();
			ChromaEffects.sChromaAnimationAPI = sChromaAnimationAPI;
	
			logMessage("*****Constructing AppInfo...");
			JAppInfoType appInfo = new JAppInfoType();
	
		    appInfo.setTitle("Minecraft Chroma Mod");
		    appInfo.setDescription("A sample application using Razer Chroma SDK");
		    appInfo.setAuthorName("Tim Graupmann");
		    appInfo.setAuthorContact("https://github.com/tgraupmann/MinecraftChromaMod");
	
		    //appInfo.SupportedDevice = 
		    //    0x01 | // Keyboards
		    //    0x02 | // Mice
		    //    0x04 | // Headset
		    //    0x08 | // Mousepads
		    //    0x10 | // Keypads
		    //    0x20   // ChromaLink devices
		    //    ;
		    appInfo.supportedDevice = (0x01 | 0x02 | 0x04 | 0x08 | 0x10 | 0x20);
		    appInfo.category = 2;
		    logMessage("*****Initializing Chroma...");
			int result = sChromaAnimationAPI.initSDK(appInfo);
			if (result == 0) {
				mChromaInitialized = true;
				logMessage("*****Initialized ChromaSDK!");
			} else {
				logError("******* Failed to initialize ChromaSDK! error="+result);
				mChromaInitialized = false;
			}
	
			// Keep Chroma in the same thread to avoid multiple threads manipulating the same animations
			setupChromaThread();
	
			//avoid blocking the main thread
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							setupBaseAnimation("ChromaLink");
							setupBaseAnimation("Headset");
							setupBaseAnimation("Keyboard");
							setupBaseAnimation("Keypad");
							setupBaseAnimation("Mouse");
							setupBaseAnimation("Mousepad");
							sChromaAnimationAPI.useIdleAnimations(true);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
		}
	}

	private void uninit() {
		mWaitForExit = false;
		Timer timer = new Timer("Timer");
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						sChromaAnimationAPI.stopAll();
						sChromaAnimationAPI.closeAll();
						sChromaAnimationAPI.uninit();
						mChromaInitialized = false;
					}
					
					ChromaEffects.sChromaAnimationAPI = null;
					sChromaAnimationAPI = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		timer.schedule(task, 100);
	}

	private void playAnimationName(String name, boolean loop) {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						String path = getAnimationPath() + name;
						sChromaAnimationAPI.closeAnimationName(path);
						sChromaAnimationAPI.playAnimationName(path, loop);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}
	private void playAnimationReverseName(String name, boolean loop) {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						String path = getAnimationPath() + name;
						sChromaAnimationAPI.closeAnimationName(path);
						sChromaAnimationAPI.reverseAllFramesName(path);
						sChromaAnimationAPI.playAnimationName(path, loop);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	private void setupBaseAnimation(String device) {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						int ground = sChromaAnimationAPI.getRGB(64, 32, 0);
	
						String baseLayer = getAnimationPath() + "Blank_" + device + ".chroma";
						sChromaAnimationAPI.closeAnimationName(baseLayer);
						sChromaAnimationAPI.fillZeroColorAllFramesName(baseLayer, ground);
	
						String idleAnimation = "Idle_" + device + ".chroma";
						sChromaAnimationAPI.copyAnimationName(baseLayer, idleAnimation);
						sChromaAnimationAPI.setIdleAnimationName(idleAnimation);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	@SubscribeEvent
	public void handleStart(ServerStartingEvent event) {
		init();
	}


	@SubscribeEvent
	public void handleStop(ServerStoppingEvent event) {
		uninit();
	}
	
	private boolean _mWasPaused = false;
	private Minecraft _mMinecraft = null;
	
	@SubscribeEvent
	public void handleMainMenu(ScreenEvent.InitScreenEvent event) {
		init();
		if (mChromaInitialized) {
			Screen gui = event.getScreen();
			if (null != gui) {
				_mMinecraft = gui.getMinecraft();
				//logMessage("handleMainMenu gui="+gui);
				if (gui instanceof PauseScreen) {
					//logMessage("Main Menu Open");
					showEffectMainMenu();
					showEffectMainMenuChromaLink();
					showEffectMainMenuHeadset();
					showEffectMainMenuKeypad();
					showEffectMainMenuMouse();
					showEffectMainMenuMousepad();
					_mWasPaused = true;
				}
			}
		}
	}
	
	@SubscribeEvent
	public void handleScreenEvent(RenderGameOverlayEvent event) {
		init();
		if (null != _mMinecraft && null != _mMinecraft.screen) {
			//logMessage("handleScreenEvent screen="+_mMinecraft.screen);
			if (mChromaInitialized && _mWasPaused && !(_mMinecraft.screen instanceof PauseScreen)) {
				//logMessage("Main Menu Closed");						
		        sChromaAnimationAPI.stopAnimationName(getAnimationPath()+"Rainbow_ChromaLink.chroma");
		        sChromaAnimationAPI.stopAnimationName(getAnimationPath()+"Rainbow_Headset.chroma");
		        sChromaAnimationAPI.stopAnimationName(getAnimationPath()+"Rainbow_Keyboard.chroma");
		        sChromaAnimationAPI.stopAnimationName(getAnimationPath()+"Rainbow_Keypad.chroma");
		        sChromaAnimationAPI.stopAnimationName(getAnimationPath()+"Rainbow_Mouse.chroma");
		        sChromaAnimationAPI.stopAnimationName(getAnimationPath()+"Rainbow_Mousepad.chroma");
		        _mWasPaused = false;
			}
		}
	}

	@SubscribeEvent
	public void handlePlaceBlock(BlockEvent.EntityPlaceEvent event) {
		init();
		// doesn't fire on client
		/*
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
			case "Server thread":
				// Only interested in Client thread
				return;
		}
		*/

		logMessage("Placed block");
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						showEffect4();
						showEffect4ChromaLink();
						showEffect4Headset();
						showEffect4Mousepad();
						showEffect4Mouse();
						showEffect4Keypad();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}


	@SubscribeEvent
	public void handleCraftItem(PlayerEvent.ItemCraftedEvent event) {
		init();
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
			case "Server thread":
				// Only interested in Client thread
				return;
		}

		logMessage("Crafted item");
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						showEffect7();
						showEffect7ChromaLink();
						showEffect7Headset();
						showEffect7Mousepad();
						showEffect7Mouse();
						showEffect7Keypad();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}


	@SubscribeEvent
	public void handlePlayerDamage(LivingDamageEvent event) {
		init();
		// doesn't fire on client
		/*
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
			case "Server thread":
				// Only interested in Client thread
				return;
		}
		*/

		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					logMessage("handlePlayerDamage directEntity="+event.getSource().getDirectEntity());
					if (event.getSource().getDirectEntity() instanceof Creeper) {
						logMessage("Damaged by creeper");
						if (mChromaInitialized) {
							showEffect10();
							showEffect10ChromaLink();
							showEffect10Headset();
							showEffect10Mousepad();
							showEffect10Mouse();
							showEffect10Keypad();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}


	@SubscribeEvent
	public void handleArrowLooseEvent(ArrowLooseEvent event) {
		init();
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}

		logMessage("Player shot an arrow");
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						showEffect5();
						showEffect5ChromaLink();
						showEffect5Headset();
						showEffect5Mousepad();
						showEffect5Mouse();
						showEffect5Keypad();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	@SubscribeEvent
	public void handleLivingDeathEvent(LivingDeathEvent event) {
		init();
		// Doesn't fire on client
		/*
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
			case "Server thread":
				// Only interested in Client thread
				return;
		}
		*/

		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					logMessage("handleLivingDeathEvent: livingEntity="+event.getEntityLiving());
					logMessage("handleLivingDeathEvent: directEntity="+event.getSource().getDirectEntity());

					if (event.getEntityLiving() instanceof Pig) {
						if (event.getSource().getDirectEntity() instanceof Player) {
							logMessage("Player killed pig");
							if (mChromaInitialized) {
								showEffect12();
								showEffect12ChromaLink();
								showEffect12Headset();
								showEffect12Mousepad();
								showEffect12Mouse();
								showEffect12Keypad();
							}
						}
					} else if (event.getEntityLiving() instanceof Chicken) {
						if (event.getSource().getDirectEntity() instanceof Player) {
							logMessage("Player killed chicken");
							if (mChromaInitialized) {
								showEffect15();
								showEffect15ChromaLink();
								showEffect15Headset();
								showEffect15Mousepad();
								showEffect15Mouse();
								showEffect15Keypad();
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	void setupChestOpen() {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						showEffect13();
						showEffect13ChromaLink();
						showEffect13Headset();
						showEffect13Mousepad();
						showEffect13Mouse();
						showEffect13Keypad();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	@SubscribeEvent
	public void handlePlayerContainerEvent(PlayerContainerEvent event) {
		init();
		/*
		// event only seems to run on the server
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}
		*/

		logMessage("handlePlayerContainerEvent: countainer="+event.getContainer().getClass());
		if (event.getContainer() instanceof ChestMenu) {
			if (event.getClass() == PlayerContainerEvent.Open.class) {
				logMessage("Chest Opened");
				setupChestOpen();
			} else if (event.getClass() == PlayerContainerEvent.Close.class) {
				logMessage("Chest Closed");
				stopAll();
			}
		}
	}

	private void setupDoorClose() {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
						String layer2 = getAnimationPath() + "Block4_Keyboard.chroma";
						sChromaAnimationAPI.closeAnimationName(baseLayer);
						sChromaAnimationAPI.closeAnimationName(layer2);
	
						int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
						sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
	
						sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
	
						sChromaAnimationAPI.reverseAllFramesName(layer2);
						sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
	
						sChromaAnimationAPI.trimEndFramesName(baseLayer, 9);
						sChromaAnimationAPI.insertDelayName(baseLayer, 8, 10);
						sChromaAnimationAPI.fadeEndFramesName(baseLayer, 5);
	
						int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
						int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
						sChromaAnimationAPI.multiplyNonZeroTargetColorLerpAllFramesName(baseLayer, color1, color2);
	
						sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 48, 0);
	
						sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
	
						sChromaAnimationAPI.playAnimationName(baseLayer, false);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	private void setupDoorOpen() {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
						String layer2 = getAnimationPath() + "Block4_Keyboard.chroma";
						sChromaAnimationAPI.closeAnimationName(baseLayer);
						sChromaAnimationAPI.closeAnimationName(layer2);
	
						int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
						sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
	
						sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
	
						sChromaAnimationAPI.reverseAllFramesName(layer2);
						sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
	
						sChromaAnimationAPI.trimEndFramesName(baseLayer, 9);
						sChromaAnimationAPI.insertDelayName(baseLayer, 8, 10);
						sChromaAnimationAPI.fadeEndFramesName(baseLayer, 5);
	
						int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
						int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
						sChromaAnimationAPI.multiplyNonZeroTargetColorLerpAllFramesName(baseLayer, color1, color2);
	
						sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 48, 0);
	
						sChromaAnimationAPI.reverseAllFramesName(baseLayer);
	
						sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
	
						sChromaAnimationAPI.playAnimationName(baseLayer, false);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	private void swordAttack() {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						showEffect3();
						showEffect3ChromaLink();
						showEffect3Headset();
						showEffect3Mousepad();
						showEffect3Mouse();
						showEffect3Keypad();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}


	@SubscribeEvent
	public void handleLeftClickEmpty(PlayerInteractEvent.LeftClickEmpty event) {
		init();
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
			case "Server thread":
				// Only interested in Client thread
				return;
		}
		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.DIAMOND_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.GOLDEN_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.IRON_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.STONE_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.WOODEN_SWORD){
			logMessage("SWORD ATTACK");
			swordAttack();
		}
	}


	@SubscribeEvent
	public void handleLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		init();
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
			case "Server thread":
				// Only interested in Client thread
				return;
		}
		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.DIAMOND_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.GOLDEN_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.IRON_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.STONE_SWORD ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.WOODEN_SWORD){
			logMessage("SWORD ATTACK");
			swordAttack();
		}
	}


	@SubscribeEvent
	public void handleRightClickEmpty(PlayerInteractEvent.RightClickEmpty event) {
		init();

		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.PUFFERFISH_SPAWN_EGG) {
			logMessage("Spawn puffer fish");
			//avoid blocking the main thread
			TimerTask task = new TimerTask() {
				public void run() {
					try {					
						if (mChromaInitialized) {
							showEffect17();
							showEffect17ChromaLink();
							showEffect17Headset();
							showEffect17Mousepad();
							showEffect17Mouse();
							showEffect17Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
			return;
		}

		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.TROPICAL_FISH_SPAWN_EGG) {
			logMessage("Spawn tropical fish");
			//avoid blocking the main thread
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect18();
							showEffect18ChromaLink();
							showEffect18Headset();
							showEffect18Mousepad();
							showEffect18Mouse();
							showEffect18Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
			return;
		}

		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.POTION ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.LINGERING_POTION ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.SPLASH_POTION) {
			logMessage("Drinking potion");
			//avoid blocking the main thread
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect14();
							showEffect14ChromaLink();
							showEffect14Headset();
							showEffect14Mousepad();
							showEffect14Mouse();
							showEffect14Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
			return;
		}
	}


	@SubscribeEvent
	public void handleRightClickBlock(RightClickBlock event) {
		init();

		String threadName = Thread.currentThread().getName();
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}

		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.PUFFERFISH_SPAWN_EGG){
			logMessage("Spawn puffer fish");
			//avoid blocking the main thread
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect17();
							showEffect17ChromaLink();
							showEffect17Headset();
							showEffect17Mousepad();
							showEffect17Mouse();
							showEffect17Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
			return;
		}

		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.TROPICAL_FISH_SPAWN_EGG){
			logMessage("Spawn tropical fish");
			//avoid blocking the main thread
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect18();
							showEffect18ChromaLink();
							showEffect18Headset();
							showEffect18Mousepad();
							showEffect18Mouse();
							showEffect18Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
			return;
		}

		if (event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.POTION ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.LINGERING_POTION ||
				event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.SPLASH_POTION) {
			logMessage("Drinking potion");
			//avoid blocking the main thread
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect14();
							showEffect14ChromaLink();
							showEffect14Headset();
							showEffect14Mousepad();
							showEffect14Mouse();
							showEffect14Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
			return;
		}

		//avoid blocking the main thread
		Timer timer = new Timer("Timer");
		final BlockPos pos = event.getPos();
		final Level world = event.getWorld();
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					BlockState blockState = world.getBlockState(pos);
					if (null != blockState) {
						StateHolder stateHolder = (StateHolder)blockState;
						Block block = blockState.getBlock();
						if (block == Blocks.ACACIA_DOOR || block == Blocks.BIRCH_DOOR || block == Blocks.DARK_OAK_DOOR
								|| block == Blocks.IRON_DOOR || block == Blocks.JUNGLE_DOOR || block == Blocks.SPRUCE_DOOR
								|| block == Blocks.OAK_DOOR) {
								if ((boolean) stateHolder.getValue(BlockStateProperties.OPEN)) {
									logMessage("Door is open");
									playAnimationName("OpenDoor_ChromaLink.chroma", false);
									playAnimationName("OpenDoor_Headset.chroma", false);
									playAnimationName("OpenDoor_Mouse.chroma", false);
									playAnimationName("OpenDoor_Mousepad.chroma", false);
									setupDoorOpen();
								} else {
									logMessage("Door is closed");
									playAnimationReverseName("OpenDoor_ChromaLink.chroma", false);
									playAnimationReverseName("OpenDoor_Headset.chroma", false);
									playAnimationReverseName("OpenDoor_Mouse.chroma", false);
									playAnimationReverseName("OpenDoor_Mousepad.chroma", false);
									setupDoorClose();
								}
							}
	
						}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		long delay = 250; //ms
		timer.schedule(task, delay);
	}

	@SubscribeEvent
	void handleWorldTickEvent(TickEvent.WorldTickEvent event) {
		init();

		boolean isRaining = false;
		boolean isSnowing = false;
		if (event.world.isRainingAt(mPlayerState.mPosition)) {
			BlockState blockState = event.world.getBlockState(mPlayerState.mPosition);
			if (blockState.getBlock() == Blocks.SNOW ||
					blockState.getBlock() == Blocks.SNOW_BLOCK) {
				isSnowing = true;
			} else {
				Biome biome = event.world.getBiome(mPlayerState.mPosition);
				switch (biome.getPrecipitation()) {
					case RAIN:
						isRaining = true;
						break;
					case SNOW:
						isSnowing = true;
						break;
				}
			}
		}

		if (isRaining && !mPlayerState.mIsRaining) {
			mPlayerState.mIsRaining = true;
			logMessage("Player is in the rain");
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect22();
							showEffect22ChromaLink();
							showEffect22Headset();
							showEffect22Mousepad();
							showEffect22Mouse();
							showEffect22Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
		}
		else if (!isRaining && mPlayerState.mIsRaining) {
			mPlayerState.mIsRaining = false;
			logMessage("Player is not in the rain");
			if (!isSnowing) {
				stopAll();
			}
		}

		if (isSnowing && !mPlayerState.mIsSnowing) {
			mPlayerState.mIsSnowing = true;
			logMessage("Player is in the snow");
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect21();
							showEffect21ChromaLink();
							showEffect21Headset();
							showEffect21Mousepad();
							showEffect21Mouse();
							showEffect21Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
		}
		else if (!isSnowing && mPlayerState.mIsSnowing) {
			mPlayerState.mIsSnowing = false;
			logMessage("Player is not in the snow");
			if (!isRaining) {
				stopAll();
			}
		}
	}

	@SubscribeEvent
	void handlePlayerTickEvent(PlayerTickEvent event) {
		init();

		String threadName = Thread.currentThread().getName();
		switch (threadName) {
			case "Server thread":
				// Only interested in Client thread
				return;
		}

		mPlayerState.mPosition = new BlockPos(event.player.position().x, event.player.position().y, event.player.position().z);

		if (event.player.isInWater() && !mPlayerState.mInWater) {
			mPlayerState.mInWater = true;
			logMessage("Player is in Water");
			setupInWater();
		}
		else if (!event.player.isInWater() && mPlayerState.mInWater) {
			mPlayerState.mInWater = false;
			logMessage("Player is not in Water");
			stopAll();
		}

		boolean isOnGround = event.player.isOnGround() && !event.player.isSwimming();
		if (isOnGround && !mPlayerState.mOnGround) {
			mPlayerState.mOnGround = true;
			//logMessage("Player is on ground");
		}
		else if (!isOnGround && mPlayerState.mOnGround) {
			mPlayerState.mOnGround = false;
			//logMessage("Player is not on the ground");
		}

		if (!event.player.isOnGround() && !mPlayerState.mInAir) {
			mPlayerState.mInAir = true;
			//logMessage("Player is in the air");
		}
		else if (event.player.isOnGround() && mPlayerState.mInAir) {
			mPlayerState.mInAir = false;
			//logMessage("Player is not in the air");
		}

		if (!event.player.isAlive() && mPlayerState.mAlive) {
			mPlayerState.mAlive = false;
			logMessage("Player is Dead");
		}
		else if (event.player.isAlive() && !mPlayerState.mAlive) {
			mPlayerState.mAlive = true;
			logMessage("Player is Alive");
		}

		if (event.player.isInLava() && !mPlayerState.mInLava) {
			mPlayerState.mInLava = true;
			logMessage("Player is in Lava");
		}
		else if (!event.player.isInLava() && mPlayerState.mInLava) {
			mPlayerState.mInLava = false;
			logMessage("Player is not in Lava");
		}

		if (event.player.onClimbable() && !mPlayerState.mOnLadder) {
			mPlayerState.mOnLadder = true;
			logMessage("Player is on ladder");
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect9();
							showEffect9ChromaLink();
							showEffect9Headset();
							showEffect9Mousepad();
							showEffect9Mouse();
							showEffect9Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
		}
		else if (!event.player.onClimbable() && mPlayerState.mOnLadder) {
			mPlayerState.mOnLadder = false;
			logMessage("Player is not on ladder");
			stopAll();
		}

		//TODO: uncomment
		/*
		if (event.player.getRidingEntity() instanceof MinecartEntity && !mPlayerState.mInMinecart)  {
			mPlayerState.mInMinecart = true;
			logMessage("Player is in the minecart");
			TimerTask task = new TimerTask() {
				public void run() {
					try {
						if (mChromaInitialized) {
							showEffect6();
							showEffect6ChromaLink();
							showEffect6Headset();
							showEffect6Mousepad();
							showEffect6Mouse();
							showEffect6Keypad();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			addChromaTask(task);
		}
		else if (!(event.player.getRidingEntity() instanceof MinecartEntity) && mPlayerState.mInMinecart)  {
			mPlayerState.mInMinecart = false;
			logMessage("Player is not in the minecart");
			stopAll();
		}
		*/
	}

	private void setupInWater() {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						showEffect11();
						showEffect11ChromaLink();
						showEffect11Headset();
						showEffect11Mousepad();
						showEffect11Mouse();
						showEffect11Keypad();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}

	private void stopAll() {
		//avoid blocking the main thread
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (mChromaInitialized) {
						sChromaAnimationAPI.stopAll();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		addChromaTask(task);
	}
}
