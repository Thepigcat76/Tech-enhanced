package com.thepigcat76;

import com.thepigcat76.item.TEItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechEnhanced implements ModInitializer {
	public static final String MOD_ID = "tech_enhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger("tech_enhanced");

	@Override
	public void onInitialize() {
		TEItems.registerModItems();
	}
}