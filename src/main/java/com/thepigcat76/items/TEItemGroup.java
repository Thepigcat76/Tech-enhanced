package com.thepigcat76.items;

import com.thepigcat76.TechEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import techreborn.init.TRContent;

public class TEItemGroup {
    public static ItemGroup TECH_ENHANCED = Registry.register(Registries.ITEM_GROUP, new Identifier(TechEnhanced.MOD_ID, "tech_enhanced"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.citrine"))
                    .icon(() -> new ItemStack(TRContent.COMPUTER_CUBE)).entries((displayContext, entries) -> {
                        entries.add(TEItems.ELECTRIC_HOE);
                        entries.add(TEItems.ELECTRIC_WRENCH);

                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(TEItems.ELECTRIC_HOE);
            entries.add(TEItems.ELECTRIC_WRENCH);
        });
    }

}
