package testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="testMod",name="Test Mod",version="1.0")
public class Main {
	@EventHandler //Вспомогательная аннотация
	public void preInit(FMLPreInitializationEvent event) {
		//Тут можно регистрировать предметы, блоки, слушатели событий, сущности
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Рецепты, достижения и прочее, что требует уже инициализированные предметы, блоки
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//Для интеграции с другими модами. Например, регистрация вкладки для таумкрафта
	}
}