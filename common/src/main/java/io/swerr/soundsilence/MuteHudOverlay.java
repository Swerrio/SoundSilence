package io.swerr.soundsilence;

import net.minecraft.client.DeltaTracker; // ИЗМЕНЕНО: Новый импорт
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

public class MuteHudOverlay {
    private static final Component MUTED_TEXT = Component.literal("Muted");
    private static final int TEXT_COLOR = 0xFF_FF5555;

    public static void render(GuiGraphics graphics, DeltaTracker deltaTracker) {
        Minecraft client = Minecraft.getInstance();

        if (SoundManager.isMuted()) {
            int screenWidth = client.getWindow().getGuiScaledWidth();
            int textWidth = client.font.width(MUTED_TEXT);

            int x = screenWidth - textWidth - 5;
            int y = 5;

            graphics.drawString(client.font, MUTED_TEXT, x, y, TEXT_COLOR, true);
        }
    }
}