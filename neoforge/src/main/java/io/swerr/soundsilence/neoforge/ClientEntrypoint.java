package io.swerr.soundsilence.neoforge;

import dev.architectury.event.events.client.ClientGuiEvent;
import io.swerr.soundsilence.MuteHudOverlay;
import io.swerr.soundsilence.SoundSilenceClient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;

public class ClientEntrypoint {
    public static void register(IEventBus modEventBus) {
        // Инициализируем общий клиентский код (создание объекта KeyMapping)
        SoundSilenceClient.init();

        // Регистрируем обработчики на шину событий мода (для регистрации клавиш и т.д.)
        modEventBus.register(new ClientModBusEvents());
        // Регистрируем обработчики на главную шину событий Forge (для обработки ввода)
        NeoForge.EVENT_BUS.register(new ClientForgeEvents());

        // НОВОЕ: Регистрируем наш оверлей для отрисовки HUD через Architectury API
        ClientGuiEvent.RENDER_HUD.register(MuteHudOverlay::render);
    }
}