package com.thepigcat76.items.armor;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.thepigcat76.TechEnhanced;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import reborncore.api.items.ArmorBlockEntityTicker;
import reborncore.common.powerSystem.RcEnergyItem;
import reborncore.common.powerSystem.RcEnergyTier;
import reborncore.common.util.ItemUtils;
import techreborn.items.armor.TRArmourItem;
import techreborn.utils.InitUtils;

import java.util.Objects;

public class NanoSuitItem extends TRArmourItem implements ArmorBlockEntityTicker, RcEnergyItem {
    public long nightVisionCost = 10L;

    public NanoSuitItem(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(TechEnhanced.ITEMGROUP).maxDamage(-1).maxCount(1));
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot equipmentSlot) {
        var attributes = ArrayListMultimap.create(super.getAttributeModifiers(stack, slot));

        if (equipmentSlot == this.slot && getStoredEnergy(stack) > 0) {
            attributes.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(MODIFIERS[slot.getEntitySlotId()], "Armor modifier", 8, EntityAttributeModifier.Operation.ADDITION));
            attributes.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(MODIFIERS[slot.getEntitySlotId()], "Knockback modifier", 0.2, EntityAttributeModifier.Operation.ADDITION));
        }

        return ImmutableMultimap.copyOf(attributes);
    }


    @Override
    public void tickArmor(ItemStack stack, PlayerEntity playerEntity) {
        if (Objects.requireNonNull(this.slot) == EquipmentSlot.HEAD) {
            if (tryUseEnergy(stack, nightVisionCost)) {
                playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 120, 1, false, false));
            } else {
                playerEntity.removeStatusEffect(StatusEffects.NIGHT_VISION);
            }
        }
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return HashMultimap.create();
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        return ItemUtils.getPowerForDurabilityBar(stack);
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return ItemUtils.getColorForDurabilityBar(stack);
    }

    @Override
    public boolean canRepair(ItemStack itemStack_1, ItemStack itemStack_2) {
        return false;
    }

    @Override
    public long getEnergyCapacity() {
        return (1000000);
    }

    @Override
    public RcEnergyTier getTier() {
        return RcEnergyTier.HIGH;
    }

    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> itemList) {
        if (!isIn(group)) {
            return;
        }
        InitUtils.initPoweredItems(this, itemList);
    }
}