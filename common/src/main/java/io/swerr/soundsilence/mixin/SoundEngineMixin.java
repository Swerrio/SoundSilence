package io.swerr.soundsilence.mixin;

import io.swerr.soundsilence.SoundManager;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.client.sounds.SoundEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SoundEngine.class)
public class SoundEngineMixin {

    @Inject(method = "play", at = @At("HEAD"), cancellable = true)
    private void soundsilence$onPlaySound(SoundInstance soundInstance, CallbackInfoReturnable<SoundEngine.PlayResult> ci) {
        if (SoundManager.isMuted()) {
            ci.cancel();
        }
    }
}