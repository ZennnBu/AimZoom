package com.aimzoom.mixin;

import net.minecraft.client.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyReturnValue;

@Mixin(Camera.class)
public abstract class GameRendererMixin {
    @ModifyReturnValue(method = "calculateFov", at = @At("RETURN"))
    private float aimzoom$modifyFov(float fov) {
        return fov;
    }
}
