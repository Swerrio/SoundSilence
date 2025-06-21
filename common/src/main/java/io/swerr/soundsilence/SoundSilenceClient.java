package io.swerr.soundsilence;

import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public final class SoundSilenceClient {

    public static final String KEY_CATEGORY = "key.category.soundsilence";
    public static final String KEY_TOGGLE_MUTE = "key.soundsilence.toggle_mute";

    public static KeyMapping toggleMuteKey;

    public static void init() {
        toggleMuteKey = new KeyMapping(
                KEY_TOGGLE_MUTE,
                GLFW.GLFW_KEY_M,
                KEY_CATEGORY
        );
    }
}