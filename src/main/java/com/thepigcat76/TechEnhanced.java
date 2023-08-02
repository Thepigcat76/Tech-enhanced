package com.thepigcat76;

import com.thepigcat76.blocks.TEBlocks;
import com.thepigcat76.items.TEItemGroup;
import com.thepigcat76.items.TEItems;
import com.thepigcat76.packets.ServerboundPackets;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechEnhanced implements ModInitializer {
	public static final String MOD_ID = "tech_enhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger("tech_enhanced");

	@Override
	public void onInitialize() {
		TEItems.registerModItems();
		TEItemGroup.registerItemGroups();
		TEBlocks.registerModBlocks();
		ServerboundPackets.init();
	}
}