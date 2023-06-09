package com.thepigcat76.item;

import com.thepigcat76.TechEnhanced;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TEItems {
    public static final Item Test = registerItem("test", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TechEnhanced.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TechEnhanced.LOGGER.info("Registering Mod Items for " + TechEnhanced.MOD_ID);
    }
}