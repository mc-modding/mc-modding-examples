package ru.mcmodding.testmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTest extends Item {
    public ItemTest() {
        this.setRegistryName("item_test");
        this.setUnlocalizedName("itemTest");

        this.setCreativeTab(CreativeTabs.TOOLS);
    }

    //
    // Добавление редкости предмету
    //
    public EnumRarity getRarity(ItemStack stack) {
        return Items.RARITY_LEGENDARY;
    }
}