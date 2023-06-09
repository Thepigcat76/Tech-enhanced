package com.thepigcat76.init;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;

import static techreborn.init.TRToolMaterials.copy;

public class TEToolMaterials {
    public static final ToolMaterial ELECTRIC_HOE;
    public static final ToolMaterial ELECTRIC_WRENCH;

    public TEToolMaterials() {
    }

    static {
        ELECTRIC_HOE = copy(ToolMaterials.IRON, "electric_hoe");
        ELECTRIC_WRENCH = copy(ToolMaterials.IRON, "electric_wrench");
    }
}
