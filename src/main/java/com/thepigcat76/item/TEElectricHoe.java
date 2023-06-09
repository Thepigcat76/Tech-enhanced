package com.thepigcat76.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;
import reborncore.common.powerSystem.RcEnergyItem;
import reborncore.common.powerSystem.RcEnergyTier;

public class TEElectricHoe extends HoeItem implements RcEnergyItem {
    public TEElectricHoe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public long getEnergyCapacity() {
        return 10000;
    }

    @Override
    public RcEnergyTier getTier() {
        return RcEnergyTier.MEDIUM;
    }
}
