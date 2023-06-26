package com.thepigcat76.blocks;

import com.thepigcat76.TechEnhanced;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import techreborn.init.TRContent;

public class TEBlocks extends TRContent {

    //public static final Block GUNPOWDER_BARREL = registerBlock("gunpowder_barrel",
    //        new GunpowderBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).strength(2.5f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(TechEnhanced.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registry.ITEM, new Identifier(TechEnhanced.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        TechEnhanced.LOGGER.info("Registering ModBlocks for " + TechEnhanced.MOD_ID);
    }
}