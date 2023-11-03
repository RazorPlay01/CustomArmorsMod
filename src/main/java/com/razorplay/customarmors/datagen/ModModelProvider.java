package com.razorplay.customarmors.datagen;

import com.razorplay.customarmors.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_CHESPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_CHESPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLUE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_CHESPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_CHESPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RED_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_CHESPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.YELLOW_BOOTS));
    }
}
