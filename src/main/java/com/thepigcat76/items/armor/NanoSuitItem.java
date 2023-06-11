package com.thepigcat76.items.armor;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import reborncore.api.items.ArmorBlockEntityTicker;
import reborncore.api.items.ArmorRemoveHandler;
import reborncore.common.powerSystem.RcEnergyTier;
import techreborn.items.armor.TREnergyArmourItem;

public class NanoSuitItem extends TREnergyArmourItem implements ArmorBlockEntityTicker, ArmorRemoveHandler {
    public long nightVisionCost = 10L;

    public NanoSuitItem(ArmorMaterial material, Type slot) {
        super(material, slot, 1000000, RcEnergyTier.HIGH);
    }

    @Override
    public void tickArmor(ItemStack stack, PlayerEntity playerEntity) {
        switch (this.getSlotType()) {
            case HEAD:
                if (this.tryUseEnergy(stack, this.nightVisionCost)) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5, 1));
                }
                break;
            case CHEST:
                //Add jetpack functionality later
        }
    }

    @Override
    public void onRemoved(PlayerEntity playerEntity) {

    }
}
