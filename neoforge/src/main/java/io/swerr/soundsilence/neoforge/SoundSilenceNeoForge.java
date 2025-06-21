package io.swerr.soundsilence.neoforge;

import io.swerr.soundsilence.SoundSilence;
import net.neoforged.fml.common.Mod;

@Mod(SoundSilence.MOD_ID)
public final class SoundSilenceNeoForge {
    public SoundSilenceNeoForge() {
        // Run our common setup.
        SoundSilence.init();
    }
}
