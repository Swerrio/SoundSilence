package io.swerr.soundsilence.neoforge;

import io.swerr.soundsilence.SoundSilence;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(SoundSilence.MOD_ID)
public final class SoundSilenceNeoForge {
    public SoundSilenceNeoForge(IEventBus modEventBus, Dist dist) {
        if (dist.isClient()) {
            ClientEntrypoint.register(modEventBus);
        }
    }
}