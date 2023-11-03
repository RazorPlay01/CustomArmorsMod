package com.razorplay.customarmors.datagen;

import com.razorplay.customarmors.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLACK_HELMET, ModItems.BLACK_CHESPLATE, ModItems.BLACK_LEGGINGS, ModItems.BLACK_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLUE_HELMET, ModItems.BLUE_CHESPLATE, ModItems.BLUE_LEGGINGS, ModItems.BLUE_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.GREEN_HELMET, ModItems.GREEN_CHESPLATE, ModItems.GREEN_LEGGINGS, ModItems.GREEN_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RED_HELMET, ModItems.RED_CHESPLATE, ModItems.RED_LEGGINGS, ModItems.RED_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.YELLOW_HELMET, ModItems.YELLOW_CHESPLATE, ModItems.YELLOW_LEGGINGS, ModItems.YELLOW_BOOTS);

    }
}
