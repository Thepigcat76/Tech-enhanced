package com.thepigcat76;

import com.thepigcat76.packets.ServerboundPackets;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import reborncore.client.ClientNetworkManager;

public class TechEnhancedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBinding binding1 = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.tech_enhanced.gravi_suite", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_P, "key.category.tech_enhanced"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (binding1.wasPressed()) {
                assert client.player != null;
                client.player.sendMessage(Text.literal("Key 1 was pressed!"), false);
                ClientNetworkManager.sendToServer(ServerboundPackets.createPacketGraviActivation());
            }
        });

    }
}