package io.swerr.soundsilence.neoforge;

import io.swerr.soundsilence.SoundManager;
import io.swerr.soundsilence.SoundSilenceClient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.common.NeoForge;

public final class SoundSilenceNeoForgeClient {
    public static void register(IEventBus modEventBus) {
        SoundSilenceClient.init();

        modEventBus.register(SoundSilenceNeoForgeClient.class);
        NeoForge.EVENT_BUS.register(SoundSilenceNeoForgeClient.class);
    }

    @SubscribeEvent
    public static void onKeyRegister(RegisterKeyMappingsEvent event) {
        event.register(SoundSilenceClient.toggleMuteKey);
    }

    @SubscribeEvent
    public static void onKeyInput(InputEvent.Key event) {
        if (SoundSilenceClient.toggleMuteKey.consumeClick()) {
            SoundManager.toggleMute();
        }
    }
}