package io.swerr.soundsilence.neoforge;

import io.swerr.soundsilence.SoundSilenceClient;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

public class ClientModBusEvents {
    @SubscribeEvent
    public void onKeyRegister(RegisterKeyMappingsEvent event) {
        event.register(SoundSilenceClient.toggleMuteKey);
    }
}