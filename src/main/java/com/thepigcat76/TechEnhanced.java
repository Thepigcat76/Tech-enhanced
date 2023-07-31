package com.thepigcat76;

import com.thepigcat76.items.TEItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechEnhanced implements ModInitializer {
	public static final String MOD_ID = "tech_enhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger("tech_enhanced");

	public static ItemGroup ITEMGROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "item_group"),
			() -> new ItemStack(TEItems.ELECTRIC_HOE));

	@Override
	public void onInitialize() {
		TEItems.registerModItems();
	}
}