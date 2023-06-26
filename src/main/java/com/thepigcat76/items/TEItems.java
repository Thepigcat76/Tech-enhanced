package com.thepigcat76.items;

import com.thepigcat76.TechEnhanced;
import com.thepigcat76.init.TEArmorMaterials;
import com.thepigcat76.init.TEToolMaterials;
import com.thepigcat76.items.armor.NanoSuitItem;
import com.thepigcat76.items.tools.ElectricHoeItem;
import com.thepigcat76.items.tools.ElectricWrenchItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TEItems {
    public static final Item ELECTRIC_HOE = registerItem("electric_hoe", new ElectricHoeItem(TEToolMaterials.ELECTRIC_HOE, 0, 6, new FabricItemSettings().group(TechEnhanced.ITEMGROUP)));
    public static final Item ELECTRIC_WRENCH = registerItem("electric_wrench", new ElectricWrenchItem(new Item.Settings().group(TechEnhanced.ITEMGROUP)));
    public static final Item NANO_HELMET = registerItem("nano_helmet", new NanoSuitItem(TEArmorMaterials.NANO, EquipmentSlot.HEAD));
    public static final Item NANO_CHESTPLATE = registerItem("nano_chestplate", new NanoSuitItem(TEArmorMaterials.NANO, EquipmentSlot.CHEST));
    public static final Item NANO_LEGGINGS = registerItem("nano_leggings", new NanoSuitItem(TEArmorMaterials.NANO, EquipmentSlot.LEGS));
    public static final Item NANO_BOOTS = registerItem("nano_boots", new NanoSuitItem(TEArmorMaterials.NANO, EquipmentSlot.FEET));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TechEnhanced.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TechEnhanced.LOGGER.info("Registering Mod Items for " + TechEnhanced.MOD_ID);
    }
}