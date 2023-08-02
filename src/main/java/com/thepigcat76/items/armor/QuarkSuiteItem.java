package com.thepigcat76.items.armor;

import com.thepigcat76.init.TEArmorMaterials;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.math.Box;
import reborncore.api.items.ArmorRemoveHandler;
import reborncore.common.powerSystem.RcEnergyTier;
import techreborn.items.armor.TREnergyArmourItem;

public class QuarkSuiteItem extends TREnergyArmourItem implements ArmorRemoveHandler {

    public QuarkSuiteItem() {
        super(TEArmorMaterials.QUARK, ArmorItem.Type.CHESTPLATE, 100_000_000, RcEnergyTier.INSANE);
    }

    @Override
    public void onRemoved(PlayerEntity playerEntity) {

    }

    public void activate(PlayerEntity playerEntity) {
        Box boundingBox = playerEntity.getBoundingBox();
        playerEntity.setBoundingBox(boundingBox.shrink(boundingBox.maxX, boundingBox.maxY, boundingBox.maxZ));
        playerEntity.getAbilities().allowFlying = true;
        playerEntity.sendAbilitiesUpdate();
    }
}
