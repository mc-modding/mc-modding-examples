package ru.mcmodding.testmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.mcmodding.testmod.TestMod;

public class Items {

    //
    // Регистрация новой категории редкости "Легендарные"
    //
    public static EnumRarity RARITY_LEGENDARY = EnumHelper.addRarity("RARITY_LEGENDARY", TextFormatting.GOLD, "Legendary");

    public static ItemTest testItem = new ItemTest();

    public static void registerItems() {
        GameRegistry.register(testItem);
    }

    public static void registerItemsRender() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(testItem, 0, new ModelResourceLocation(testItem.getRegistryName(), "inventory"));
    }

}
