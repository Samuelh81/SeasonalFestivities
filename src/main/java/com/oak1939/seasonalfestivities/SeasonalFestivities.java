package com.oak1939.seasonalfestivities;

import com.oak1939.seasonalfestivities.block.ModBlocks;
import com.oak1939.seasonalfestivities.entity.ModEntities;
import com.oak1939.seasonalfestivities.item.ModItemGroups;
import com.oak1939.seasonalfestivities.item.ModItems;
import com.oak1939.seasonalfestivities.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeasonalFestivities implements ModInitializer {
	public static final String MOD_ID = "seasonalfestivities";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();

		ModEntities.registerMobs();

	}
}