package com.aimzoom;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public final class AimZoomClient implements ClientModInitializer {

    private static boolean zooming = false;
    private static double oldSensitivity;

    @Override
    public void onInitializeClient() {
        // Zoom feature will be connected in the next step.
    }
}
