package com.razorplay.customarmors.item;

import com.razorplay.customarmors.CustomArmors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CustomArmorsGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomArmors.MOD_ID, "test"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.customarmors"))
                    .icon(() -> new ItemStack(Items.GOLDEN_HELMET)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.BLACK_HELMET);
                        entries.add(ModItems.BLACK_CHESPLATE);
                        entries.add(ModItems.BLACK_LEGGINGS);
                        entries.add(ModItems.BLACK_BOOTS);

                        entries.add(ModItems.BLUE_HELMET);
                        entries.add(ModItems.BLUE_CHESPLATE);
                        entries.add(ModItems.BLUE_LEGGINGS);
                        entries.add(ModItems.BLUE_BOOTS);

                        entries.add(ModItems.GREEN_HELMET);
                        entries.add(ModItems.GREEN_CHESPLATE);
                        entries.add(ModItems.GREEN_LEGGINGS);
                        entries.add(ModItems.GREEN_BOOTS);

                        entries.add(ModItems.RED_HELMET);
                        entries.add(ModItems.RED_CHESPLATE);
                        entries.add(ModItems.RED_LEGGINGS);
                        entries.add(ModItems.RED_BOOTS);

                        entries.add(ModItems.YELLOW_HELMET);
                        entries.add(ModItems.YELLOW_CHESPLATE);
                        entries.add(ModItems.YELLOW_LEGGINGS);
                        entries.add(ModItems.YELLOW_BOOTS);
                    })).build());

    public static void registerItemGoups() {
        CustomArmors.LOGGER.info("Registering Item Groups for " + CustomArmors.MOD_ID);
    }
}
