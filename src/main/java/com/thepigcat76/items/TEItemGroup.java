package com.thepigcat76.items;

import com.thepigcat76.TechEnhanced;
import com.thepigcat76.blocks.TEBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TEItemGroup {
    public static ItemGroup TECH_ENHANCED = Registry.register(Registries.ITEM_GROUP, new Identifier(TechEnhanced.MOD_ID, "tech_enhanced"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tech_enhanced"))
                    .icon(() -> new ItemStack(TEItems.ELECTRIC_WRENCH)).entries((displayContext, entries) -> {
                        entries.add(TEItems.ELECTRIC_HOE);
                        entries.add(TEItems.ELECTRIC_WRENCH);
                        entries.add(TEItems.NANO_HELMET);
                        entries.add(TEItems.NANO_CHESTPLATE);
                        entries.add(TEItems.NANO_LEGGINGS);
                        entries.add(TEItems.NANO_BOOTS);
                        entries.add(TEBlocks.GUNPOWDER_BARREL);

                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(TEItems.ELECTRIC_HOE);
            entries.add(TEItems.ELECTRIC_WRENCH);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(TEItems.NANO_HELMET);
            entries.add(TEItems.NANO_CHESTPLATE);
            entries.add(TEItems.NANO_LEGGINGS);
            entries.add(TEItems.NANO_BOOTS);
        });
    }

}
