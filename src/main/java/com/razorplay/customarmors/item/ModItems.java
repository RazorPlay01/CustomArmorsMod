package com.razorplay.customarmors.item;

import com.razorplay.customarmors.CustomArmors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLACK_HELMET = registerItem("black_helmet",
            new ArmorItem(ModArmorMaterials.BLACK_ARMOR, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item BLACK_CHESPLATE = registerItem("black_chestplate",
            new ArmorItem(ModArmorMaterials.BLACK_ARMOR, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item BLACK_LEGGINGS = registerItem("black_leggings",
            new ArmorItem(ModArmorMaterials.BLACK_ARMOR, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item BLACK_BOOTS = registerItem("black_boots",
            new ArmorItem(ModArmorMaterials.BLACK_ARMOR, ArmorItem.Type.BOOTS,new FabricItemSettings()));

    //
    public static final Item BLUE_HELMET = registerItem("blue_helmet",
            new ArmorItem(ModArmorMaterials.BLUE_ARMOR, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item BLUE_CHESPLATE = registerItem("blue_chestplate",
            new ArmorItem(ModArmorMaterials.BLUE_ARMOR, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item BLUE_LEGGINGS = registerItem("blue_leggings",
            new ArmorItem(ModArmorMaterials.BLUE_ARMOR, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item BLUE_BOOTS = registerItem("blue_boots",
            new ArmorItem(ModArmorMaterials.BLUE_ARMOR, ArmorItem.Type.BOOTS,new FabricItemSettings()));
    //
    public static final Item GREEN_HELMET = registerItem("green_helmet",
            new ArmorItem(ModArmorMaterials.GREEN_ARMOR, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item GREEN_CHESPLATE = registerItem("green_chestplate",
            new ArmorItem(ModArmorMaterials.GREEN_ARMOR, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item GREEN_LEGGINGS = registerItem("green_leggings",
            new ArmorItem(ModArmorMaterials.GREEN_ARMOR, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item GREEN_BOOTS = registerItem("green_boots",
            new ArmorItem(ModArmorMaterials.GREEN_ARMOR, ArmorItem.Type.BOOTS,new FabricItemSettings()));
    //
    public static final Item RED_HELMET = registerItem("red_helmet",
            new ArmorItem(ModArmorMaterials.RED_ARMOR, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item RED_CHESPLATE = registerItem("red_chestplate",
            new ArmorItem(ModArmorMaterials.RED_ARMOR, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item RED_LEGGINGS = registerItem("red_leggings",
            new ArmorItem(ModArmorMaterials.RED_ARMOR, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item RED_BOOTS = registerItem("red_boots",
            new ArmorItem(ModArmorMaterials.RED_ARMOR, ArmorItem.Type.BOOTS,new FabricItemSettings()));
    //
    public static final Item YELLOW_HELMET = registerItem("yellow_helmet",
            new ArmorItem(ModArmorMaterials.YELLOW_ARMOR, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item YELLOW_CHESPLATE = registerItem("yellow_chestplate",
            new ArmorItem(ModArmorMaterials.YELLOW_ARMOR, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item YELLOW_LEGGINGS = registerItem("yellow_leggings",
            new ArmorItem(ModArmorMaterials.YELLOW_ARMOR, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item YELLOW_BOOTS = registerItem("yellow_boots",
            new ArmorItem(ModArmorMaterials.YELLOW_ARMOR, ArmorItem.Type.BOOTS,new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CustomArmors.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomArmors.LOGGER.info("Registering Mod Items for " + CustomArmors.MOD_ID);
    }
}
