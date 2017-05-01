package testmod;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="testMod",name="Test Mod",version="1.0")
public class Main {
	//Это поле forge наполнит сам, исходя из аннотации
	@SidedProxy(clientSide = "testmod.ClientProxy", serverSide = "testmod.ServerProxy")
	public static CommonProxy commonProxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);//Таким образом, мы разделили функционал на серверную и клиентскую части
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}