package occmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

// MOD INFO
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

	// Custom event handler
	private static MyForgeEventHandler mMyForgeEventHandler = null;

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		mMyForgeEventHandler = new MyForgeEventHandler();
		mMyForgeEventHandler.init();
	}
}
