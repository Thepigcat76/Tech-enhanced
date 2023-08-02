package com.thepigcat76.packets;

import com.thepigcat76.items.TEItems;
import com.thepigcat76.items.armor.QuarkSuiteItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import reborncore.common.network.IdentifiedPacket;
import reborncore.common.network.NetworkManager;
import techreborn.TechReborn;

public class ServerboundPackets {
    public static final Identifier GRAVI_ACTIVATION = new Identifier(TechReborn.MOD_ID, "gravi_activation");

    public static void init() {
        NetworkManager.registerServerBoundHandler(GRAVI_ACTIVATION, (server, player, handler, buf, responseSender) -> {

            server.execute(() -> {
                System.out.println("amogus1");
                if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() == TEItems.QUARK_SUITE.asItem()) {
                    QuarkSuiteItem quarkSuiteItem = new QuarkSuiteItem();
                    quarkSuiteItem.activate(player);
                    player.sendMessage(Text.literal("amogus"));
                }
            });
        });

    }

    public static IdentifiedPacket createPacketGraviActivation() {
        return NetworkManager.createServerBoundPacket(GRAVI_ACTIVATION, packetBuffer -> {

        });
    }
}