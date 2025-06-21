package io.swerr.soundsilence.fabric.client;

import dev.architectury.event.events.client.ClientGuiEvent;
import io.swerr.soundsilence.MuteHudOverlay;
import io.swerr.soundsilence.SoundManager;
import io.swerr.soundsilence.SoundSilenceClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public final class SoundSilenceFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SoundSilenceClient.init();
        KeyBindingHelper.registerKeyBinding(SoundSilenceClient.toggleMuteKey);

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (SoundSilenceClient.toggleMuteKey.consumeClick()) {
                SoundManager.toggleMute();
            }
        });

        ClientGuiEvent.RENDER_HUD.register(MuteHudOverlay::render);
    }
}