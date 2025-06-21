package io.swerr.soundsilence.neoforge;

import io.swerr.soundsilence.SoundManager;
import io.swerr.soundsilence.SoundSilenceClient;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.InputEvent;

public class ClientForgeEvents {
    @SubscribeEvent
    public void onKeyInput(InputEvent.Key event) {
        if (SoundSilenceClient.toggleMuteKey.consumeClick()) {
            SoundManager.toggleMute();
        }
    }
}