package ru.mcmodding.testmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.mcmodding.testmod.item.Items;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        Items.registerItems();
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}

}
