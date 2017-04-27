package ru.mcmodding.testmod;

import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.mcmodding.testmod.proxy.CommonProxy;

import static ru.mcmodding.testmod.TestMod.MODID;

@Mod(modid = MODID)
public class TestMod {

    public static final String MODID = "testmod";

    @SidedProxy(clientSide = "ru.mcmodding.testmod.proxy.ClientProxy", serverSide = "ru.mcmodding.testmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Преинициализация
        System.out.println("\u001B[32m" + "[Starting Test Mod PRE-INITIALIZATION]" + "\u001B[0m");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Инициализация
        System.out.println("\u001B[32m" + "[Starting Test Mod INITIALIZATION]" + "\u001B[0m");
        proxy.init(event);
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Инициализация
        System.out.println("\u001B[32m" + "[Starting Test Mod POST-INITIALIZATION]" + "\u001B[0m");
        proxy.postInit(event);
    }

}