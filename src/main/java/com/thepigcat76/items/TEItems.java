package com.thepigcat76.items;

import com.thepigcat76.TechEnhanced;
import com.thepigcat76.init.TEToolMaterials;
import com.thepigcat76.items.armor.QuarkSuiteItem;
import com.thepigcat76.items.tools.ElectricHoeItem;
import com.thepigcat76.items.tools.ElectricWrenchItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TEItems {
    public static final Item ELECTRIC_HOE = registerItem("electric_hoe", new ElectricHoeItem(TEToolMaterials.ELECTRIC_HOE, 0, 6, new FabricItemSettings()));
    public static final Item ELECTRIC_WRENCH = registerItem("electric_wrench", new ElectricWrenchItem());
    public static final Item QUARK_SUITE = registerItem("quark_suite", new QuarkSuiteItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TechEnhanced.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TechEnhanced.LOGGER.info("Registering Mod Items for " + TechEnhanced.MOD_ID);
    }
}