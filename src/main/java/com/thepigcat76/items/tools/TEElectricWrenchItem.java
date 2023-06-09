package com.thepigcat76.items.tools;

import reborncore.common.powerSystem.RcEnergyItem;
import reborncore.common.powerSystem.RcEnergyTier;
import techreborn.items.tool.WrenchItem;

public class TEElectricWrenchItem extends WrenchItem implements RcEnergyItem {
    @Override
    public long getEnergyCapacity() {
        return 10000;
    }

    @Override
    public RcEnergyTier getTier() {
        return RcEnergyTier.MEDIUM;
    }
}
