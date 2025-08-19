package com.lannora.couriercraft;

import com.lannora.couriercraft.block.ModBlocks;
import com.lannora.couriercraft.item.CouriercraftItemGroup;
import com.lannora.couriercraft.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CourierCraft implements ModInitializer {
	public static final String MOD_ID = "couriercraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        CouriercraftItemGroup.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}