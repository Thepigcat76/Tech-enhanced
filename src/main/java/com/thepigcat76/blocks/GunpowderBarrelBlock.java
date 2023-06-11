package com.thepigcat76.blocks;

import net.minecraft.block.TntBlock;
import reborncore.common.blocks.BlockWrenchEventHandler;

public class GunpowderBarrelBlock extends TntBlock {
    public GunpowderBarrelBlock(Settings settings) {
        super(settings);
        BlockWrenchEventHandler.wrenchableBlocks.add(this);
    }
}