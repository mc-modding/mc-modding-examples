package testmod;

import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="testMod2",name="Test Mod2",version="1.0")
public class Main2 {//Использование SideOnly вместо прокси
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}


	@SideOnly(Side.CLIENT)
	@EventHandler
	public void preInitClient(FMLPreInitializationEvent event) {
		//Все методы, помеченные @EventHandler будут выполнены, поэтому не нужно вызывать preInit из preInitClient и preInitServer
	}
	
	@SideOnly(Side.CLIENT)
	@EventHandler
	public void initClient(FMLInitializationEvent event) {
	}
	
	@SideOnly(Side.CLIENT)
	@EventHandler
	public void postInitClient(FMLPostInitializationEvent event) {
		
	}
	
	
	@SideOnly(Side.SERVER)
	@EventHandler
	public void preInitServer(FMLPreInitializationEvent event) {
	}
	
	@SideOnly(Side.SERVER)
	@EventHandler
	public void initServer(FMLInitializationEvent event) {
	}
	
	@SideOnly(Side.SERVER)
	@EventHandler
	public void postInitServer(FMLPostInitializationEvent event) {
	}
}