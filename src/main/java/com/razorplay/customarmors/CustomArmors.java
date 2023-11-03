package com.razorplay.customarmors;

import com.razorplay.customarmors.item.ModItemGroups;
import com.razorplay.customarmors.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class CustomArmors implements ModInitializer {
	public static final String MOD_ID = "customarmors";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGoups();
	}
}