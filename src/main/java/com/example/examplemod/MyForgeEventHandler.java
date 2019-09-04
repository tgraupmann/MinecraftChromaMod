package com.example.examplemod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.jglr.jchroma.JChroma;

import com.razer.chroma.javachromasdk.AnimationBase;
import com.razer.chroma.javachromasdk.ChromaAnimationAPI;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateHolder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MyForgeEventHandler {

	private class PlayerState {
		public boolean mAlive = true;
		public boolean mInAir = false;
		public boolean mOnGround = true;
		public boolean mInLava = false;
		public boolean mInWater = false;
	}

	private PlayerState mPlayerState = new PlayerState();

	List<String> mEvents = new ArrayList<String>();

	public void init() {
		
		_sChroma = JChroma.getInstance();
		_sChroma.init();
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void uninit() {
		_sChroma.free();
	}
	
	private static JChroma _sChroma;
	
	private static AnimationBase showAnimation(String animationName) {
        AnimationBase animation = null;
        System.out.println("Testing: " + animationName + " ...");
        String workingDir = System.getProperty("user.dir");
        File temp = new File(workingDir+"\\..\\src\\main\\resources\\", animationName);

        String absolutePath = temp.getAbsolutePath();
        InputStream input = null;
        try {
            input = new FileInputStream(absolutePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        try {
            if (null != input) {
                animation = ChromaAnimationAPI.OpenAnimation(input);
                input.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (animation == null) {
            System.err.println("Animation could not be loaded! " + animationName);
            return null;
        }

        int frameCount = animation.getFrameCount();
        for (int frameId = 0; frameId < frameCount; ++frameId) {
            try {
                animation.showFrame(_sChroma, frameId);
                int duration = (int)Math.floor(1000 * animation.getDuration(frameId));
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return animation;
    }

	@SubscribeEvent
	public void handleArrowLooseEvent(ArrowLooseEvent event) {
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}

		System.out.println("Player shot an arrow");
	}

	@SubscribeEvent
	public void handleLivingDeathEvent(LivingDeathEvent event) {
		String threadName = Thread.currentThread().getName();
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}

		LivingEntity entityLiving = event.getEntityLiving();
		
		if (event.getEntityLiving() instanceof BatEntity) {
			System.out.println("Bat died");
		} else if (event.getEntityLiving() instanceof HorseEntity) {
			System.out.println("Horse died");
		} else if (event.getEntityLiving() instanceof ZombieEntity) {
			System.out.println("Zombie died");
		} else if (event.getEntityLiving() instanceof PigEntity) {
			System.out.println("Pig died");
		} else {
			System.out.println("Something living died: " + entityLiving.getClass());
		}
	}

	@SubscribeEvent
	public void handlePlayerContainerEvent(PlayerContainerEvent event) {
		/*
		// event only seems to run on the server
		String threadName = Thread.currentThread().getName();
		System.out.println("handlePlayerContainerEvent: thread="+threadName);
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}
		*/

		System.out.println("handlePlayerContainerEvent: "+event.getContainer().getClass());
		if (event.getContainer() instanceof ChestContainer) {
			if (event.getClass() == PlayerContainerEvent.Open.class) {
				System.out.println("Chest Opened");
			} else if (event.getClass() == PlayerContainerEvent.Close.class) {
				System.out.println("Chest Closed");
			}
		}
	}

	@SubscribeEvent
	public void handleRightClickBlock(RightClickBlock event) {
		String threadName = Thread.currentThread().getName();
		//System.out.println("handleRightClickBlock: thread="+threadName);
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}

		final BlockPos pos = event.getPos();
		final World world = event.getWorld();
		Timer timer = new Timer("Timer");
		TimerTask task = new TimerTask() {
			public void run() {
				BlockState blockState = world.getBlockState(pos);
				if (null != blockState) {
					StateHolder stateHolder = (StateHolder)blockState;
					Block block = blockState.getBlock();
					if (block == Blocks.ACACIA_DOOR || block == Blocks.BIRCH_DOOR || block == Blocks.DARK_OAK_DOOR
							|| block == Blocks.IRON_DOOR || block == Blocks.JUNGLE_DOOR || block == Blocks.SPRUCE_DOOR
							|| block == Blocks.OAK_DOOR) {
							if ((boolean) stateHolder.get(BlockStateProperties.OPEN)) {
								System.out.println("Door is open");
								showAnimation("OpenDoor_ChromaLink.chroma");
								showAnimation("OpenDoor_Headset.chroma");
								showAnimation("OpenDoor_Keyboard.chroma");
								showAnimation("OpenDoor_Mouse.chroma");
								showAnimation("OpenDoor_Mousepad.chroma");
							} else {
								System.out.println("Door is closed");
								showAnimation("BaseEffect_ChromaLink.chroma");
								showAnimation("BaseEffect_Headset.chroma");
								showAnimation("BaseEffect_Keyboard.chroma");
								showAnimation("BaseEffect_Mouse.chroma");
								showAnimation("BaseEffect_Mousepad.chroma");
							}
						}

					}
				}
		};
		long delay = 250; //ms
		timer.schedule(task, delay);
	}

	@SubscribeEvent
	public void handleEvent(Event event) {

		String threadName = Thread.currentThread().getName();
		switch (threadName) {
		case "Server thread":
			// Only interested in Client thread
			return;
		}

		switch (event.getClass().getSimpleName()) {
		case "AchievementEvent": // net.minecraftforge.event.entity.player.AchievementEvent
		case "AllowDespawn": // net.minecraftforge.event.entity.living.LivingSpawnEvent$AllowDespawn
		case "ArrowLooseEvent": // class net.minecraftforge.event.entity.player.ArrowLooseEvent
		case "AttachCapabilitiesEvent": // net.minecraftforge.event.AttachCapabilitiesEvent
		case "AttackEntityEvent": // class net.minecraftforge.event.entity.player.AttackEntityEvent
		case "BackgroundDrawnEvent": // net.minecraftforge.client.event.GuiScreenEvent$BackgroundDrawnEvent
		case "BreakEvent": // net.minecraftforge.event.world.BlockEvent$BreakEvent
		case "BreakSpeed": // class net.minecraftforge.event.entity.player.PlayerEvent$BreakSpeed
		case "CameraSetup": // net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup
		case "CanUpdate": // net.minecraftforge.event.entity.EntityEvent$CanUpdate
		case "Chat": // net.minecraftforge.client.event.RenderGameOverlayEvent$Chat
		case "CheckSpawn": // net.minecraftforge.event.entity.living.LivingSpawnEvent$CheckSpawn
		case "ClientChatEvent": // class net.minecraftforge.client.event.ClientChatEvent
		case "ClientChatReceivedEvent": // net.minecraftforge.client.event.ClientChatReceivedEvent
		case "ClientConnectedToServerEvent": // net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
		case "ClientTickEvent": // net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
		case "Clone": // class net.minecraftforge.event.entity.player.PlayerEvent$Clone
		case "Close": // net.minecraftforge.event.entity.player.PlayerContainerEvent$Close
		case "CommandEvent": // class net.minecraftforge.event.CommandEvent
		case "CreateFluidSourceEvent": // class net.minecraftforge.event.world.BlockEvent$CreateFluidSourceEvent
		case "CustomPacketRegistrationEvent": // net.minecraftforge.fml.common.network.FMLNetworkEvent$CustomPacketRegistrationEvent
		case "Detonate": // net.minecraftforge.event.world.ExplosionEvent$Detonate
		case "DifficultyChangeEvent": // net.minecraftforge.event.DifficultyChangeEvent
		case "DrawBlockHighlightEvent": // net.minecraftforge.client.event.DrawBlockHighlightEvent
		case "EnderTeleportEvent": // class net.minecraftforge.event.entity.living.EnderTeleportEvent
		case "EnteringChunk": // net.minecraftforge.event.entity.EntityEvent$EnteringChunk
		case "Entity": // net.minecraftforge.event.AttachCapabilitiesEvent$Entity
		case "EntityConstructing": // net.minecraftforge.event.entity.EntityEvent$EntityConstructing
		case "EntityItemPickupEvent": // class net.minecraftforge.event.entity.player.EntityItemPickupEvent
		case "EntityJoinWorldEvent": // net.minecraftforge.event.entity.EntityJoinWorldEvent
		case "FogColors": // net.minecraftforge.client.event.EntityViewRenderEvent$FogColors
		case "FogDensity": // net.minecraftforge.client.event.EntityViewRenderEvent$FogDensity
		case "FOVModifier": // net.minecraftforge.client.event.EntityViewRenderEvent$FOVModifier
		case "FOVUpdateEvent": // net.minecraftforge.client.event.FOVUpdateEvent
		case "GetCollisionBoxesEvent": // net.minecraftforge.event.world.GetCollisionBoxesEvent
		case "GetFoliageColor": // net.minecraftforge.event.terraingen.BiomeEvent$GetFoliageColor
		case "GetGrassColor": // net.minecraftforge.event.terraingen.BiomeEvent$GetGrassColor
		case "GetWaterColor": // net.minecraftforge.event.terraingen.BiomeEvent$GetWaterColor
		case "GuiOpenEvent": // net.minecraftforge.client.event.GuiOpenEvent
		case "HarvestCheck": // class net.minecraftforge.event.entity.player.PlayerEvent$HarvestCheck
		case "HarvestDropsEvent": // net.minecraftforge.event.world.BlockEvent$HarvestDropsEvent
		case "Item": // net.minecraftforge.event.AttachCapabilitiesEvent$Item
		case "ItemCraftedEvent": // class net.minecraftforge.fml.common.gameevent.PlayerEvent$ItemCraftedEvent
		case "ItemExpireEvent": // net.minecraftforge.event.entity.item.ItemExpireEvent
		case "ItemPickupEvent": // class net.minecraftforge.fml.common.gameevent.PlayerEvent$ItemPickupEvent
		case "ItemTooltipEvent": // net.minecraftforge.event.entity.player.ItemTooltipEvent
		case "ItemTossEvent": // class net.minecraftforge.event.entity.item.ItemTossEvent
		case "KeyInputEvent": // net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
		case "LeftClickBlock": // net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
		case "LeftClickEmpty": // net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickEmpty
		case "LivingAttackEvent": // net.minecraftforge.event.entity.living.LivingAttackEvent
		case "LivingDeathEvent": // net.minecraftforge.event.entity.living.LivingDeathEvent
		case "LivingPackSizeEvent": // net.minecraftforge.event.entity.living.LivingPackSizeEvent
		case "LivingUpdateEvent": // net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
		case "Load": // class net.minecraftforge.event.world.WorldEvent$Load
		case "LoadFromFile": // net.minecraftforge.event.entity.player.PlayerEvent$LoadFromFile
		case "LootingLevelEvent": // net.minecraftforge.event.entity.living.LootingLevelEvent
		case "LootTableLoadEvent": // net.minecraftforge.event.LootTableLoadEvent
		case "ModelBakeEvent": // net.minecraftforge.client.event.ModelBakeEvent
		case "MouseEvent": // net.minecraftforge.client.event.MouseEvent
		case "MouseInputEvent": // net.minecraftforge.fml.common.gameevent.InputEvent$MouseInputEvent
		case "NameFormat": // net.minecraftforge.event.entity.player.PlayerEvent$NameFormat
		case "NeighborNotifyEvent": // net.minecraftforge.event.world.BlockEvent$NeighborNotifyEvent
		case "PlaceEvent": // net.minecraftforge.event.world.BlockEvent$PlaceEvent
		case "PlayerDropsEvent": // class net.minecraftforge.event.entity.player.PlayerDropsEvent
		case "PlayerDestroyItemEvent": // class net.minecraftforge.event.entity.player.PlayerDestroyItemEvent
		case "PlayerFlyableFallEvent": // net.minecraftforge.event.entity.player.PlayerFlyableFallEvent
		case "PlayerLoggedInEvent": // net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent
		case "PlayerPickupXpEvent": // class net.minecraftforge.event.entity.player.PlayerPickupXpEvent
		case "PlayerSetSpawnEvent": // net.minecraftforge.event.entity.player.PlayerSetSpawnEvent
		case "PlaySoundAtEntityEvent": // net.minecraftforge.event.entity.PlaySoundAtEntityEvent
		case "PlaySoundEvent": // net.minecraftforge.client.event.sound.PlaySoundEvent
		case "PlaySoundSourceEvent": // net.minecraftforge.client.event.sound.PlaySoundSourceEvent
		case "PlayStreamingSourceEvent": // net.minecraftforge.client.event.sound.PlayStreamingSourceEvent
		case "Post": // net.minecraftforge.client.event.TextureStitchEvent$Post
		case "PostBackground": // net.minecraftforge.client.event.RenderTooltipEvent$PostBackground
		case "PostText": // net.minecraftforge.client.event.RenderTooltipEvent$PostText
		case "PotentialSpawns": // net.minecraftforge.event.world.WorldEvent$PotentialSpawns
		case "Pre": // net.minecraftforge.client.event.TextureStitchEvent$Pre
		case "RenderBlockOverlayEvent": // class net.minecraftforge.client.event.RenderBlockOverlayEvent
		case "RenderFogEvent": // net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent
		case "RenderHandEvent": // net.minecraftforge.client.event.RenderHandEvent
		case "RenderSpecificHandEvent": // net.minecraftforge.client.event.RenderSpecificHandEvent
		case "RenderTickEvent": // net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
		case "RenderWorldLastEvent": // net.minecraftforge.client.event.RenderWorldLastEvent
		case "ReplaceBiomeBlocks": // net.minecraftforge.event.terraingen.ChunkGeneratorEvent$ReplaceBiomeBlocks
		case "RightClickBlock": // net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
		case "RightClickEmpty": // net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickEmpty
		case "RightClickItem": // net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem
		case "Save": // net.minecraftforge.event.world.ChunkDataEvent$Save
		case "SaveToFile": // net.minecraftforge.event.entity.player.PlayerEvent$SaveToFile
		case "ServerConnectionFromClientEvent": // net.minecraftforge.fml.common.network.FMLNetworkEvent$ServerConnectionFromClientEvent
		case "ServerTickEvent": // net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
		case "SoundLoadEvent": // net.minecraftforge.client.event.sound.SoundLoadEvent
		case "SpecialSpawn": // net.minecraftforge.event.entity.living.LivingSpawnEvent$SpecialSpawn
		case "Start": // net.minecraftforge.event.world.ExplosionEvent$Start
		case "StartTracking": // net.minecraftforge.event.entity.player.PlayerEvent$StartTracking
		case "Stop": // class net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Stop
		case "StopTracking": // net.minecraftforge.event.entity.player.PlayerEvent$StopTracking
		case "SummonAidEvent": // class net.minecraftforge.event.entity.living.ZombieEvent$SummonAidEvent
		case "Text": // net.minecraftforge.client.event.RenderGameOverlayEvent$Text
		case "TileEntity": // net.minecraftforge.event.AttachCapabilitiesEvent$TileEntity
		case "Unload": // net.minecraftforge.event.world.ChunkEvent$Unload
		case "UnWatch": // net.minecraftforge.event.world.ChunkWatchEvent$UnWatch
		case "Watch": // net.minecraftforge.event.world.ChunkWatchEvent$Watch
		case "World": // net.minecraftforge.event.AttachCapabilitiesEvent$World
		case "WorldTickEvent": // net.minecraftforge.fml.common.gameevent.TickEvent$WorldTickEvent
			return;
		case "Open": // class net.minecraftforge.event.entity.player.PlayerContainerEvent$Open
			System.out.println("Player Open Event: " + event);
			break;
		case "LivingDropsEvent": // net.minecraftforge.event.entity.living.LivingDropsEvent
		case "LivingEquipmentChangeEvent": // net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent
		case "LivingExperienceDropEvent": // class net.minecraftforge.event.entity.living.LivingExperienceDropEvent
		{
			String className = event.getClass().getSimpleName();
			System.out.println("case \"" + className + "\": // " + event.getClass());
			break;
		}
		case "LivingHealEvent": // class net.minecraftforge.event.entity.living.LivingHealEvent
		{
			System.out.println("Player HEALED");
			break;
		}
		case "LivingSetAttackTargetEvent": // class net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent
		{
			String className = event.getClass().getSimpleName();
			System.out.println("case \"" + className + "\": // " + event.getClass());
			break;
		}
		case "LivingFallEvent": // net.minecraftforge.event.entity.living.LivingFallEvent
		{
			System.out.println("Player FELL");
			break;
		}
		case "LivingHurtEvent": // net.minecraftforge.event.entity.living.LivingHurtEvent
		{
			System.out.println("Player HURT");
			break;
		}
		case "LivingJumpEvent": // net.minecraftforge.event.entity.living.LivingEvent$LivingJumpEvent
		{
			System.out.println("Player JUMPED");
			break;
		}
		case "PlayerRespawnEvent": // class net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerRespawnEvent
			System.out.println("Player respawned");
			break;
		case "PlayerTickEvent": // net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
		{
			PlayerTickEvent tickEvent = (PlayerTickEvent) event;

			if (tickEvent.player.isInWater() && !mPlayerState.mInWater) {
				mPlayerState.mInWater = true;
				System.out.println("Player is in Water");
			}
			if (!tickEvent.player.isInWater() && mPlayerState.mInWater) {
				mPlayerState.mInWater = false;
				System.out.println("Player is not in Water");
			}

			if (tickEvent.player.onGround && !mPlayerState.mOnGround) {
				mPlayerState.mOnGround = true;
				System.out.println("Player is on ground");
			}
			if (!tickEvent.player.onGround && mPlayerState.mOnGround) {
				mPlayerState.mOnGround = false;
				System.out.println("Player is not on the ground");
			}

			if (tickEvent.player.isAirBorne && !mPlayerState.mInAir) {
				mPlayerState.mInAir = true;
				System.out.println("Player is in the air");
			}
			if (!tickEvent.player.isAirBorne && mPlayerState.mInAir) {
				mPlayerState.mInAir = false;
				System.out.println("Player is not in the air");
			}

			if (!tickEvent.player.isAlive() && mPlayerState.mAlive) {
				mPlayerState.mAlive = false;
				System.out.println("Player is Dead");
			}
			if (tickEvent.player.isAlive() && !mPlayerState.mAlive) {
				mPlayerState.mAlive = true;
				System.out.println("Player is Alive");
			}

			if (tickEvent.player.isInLava() && !mPlayerState.mInLava) {
				mPlayerState.mInLava = true;
				System.out.println("Player is in Lava");
			}
			if (!tickEvent.player.isInLava() && mPlayerState.mInLava) {
				mPlayerState.mInLava = false;
				System.out.println("Player is not in Lava");
			}
			break;
		}
		default:
			String className = event.getClass().getSimpleName();
			if (!mEvents.contains(className)) {
				mEvents.add(className);
				System.out.println("case \"" + className + "\": // " + event.getClass());
			}
		}
	}
}
