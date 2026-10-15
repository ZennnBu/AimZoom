package com.aimzoom;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.platform.InputConstants;

public final class AimZoomClient implements ClientModInitializer {
    private static KeyMapping zoomKey;

    @Override
    public void onInitializeClient() {
        KeyMapping.Category category = KeyMapping.Category.register(
            Identifier.fromNamespaceAndPath("aimzoom", "main")
        );

        zoomKey = KeyMappingHelper.registerKeyMapping(
            new KeyMapping(
                "key.aimzoom.zoom",
                InputConstants.Type.KEYSYM,
                InputConstants.KEY_C,
                category
            )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (zoomKey.consumeClick()) {
                if (client.player != null) {
                    client.player.sendSystemMessage(
                        net.minecraft.network.chat.Component.literal("AimZoom key pressed!")
                    );
                }
            }
        });
    }
}
