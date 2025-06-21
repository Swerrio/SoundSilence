package io.swerr.soundsilence;

public final class SoundManager {
    private static boolean isMuted = false;

    public static boolean isMuted() {
        return isMuted;
    }

    public static void toggleMute() {
        isMuted = !isMuted;
        System.out.println("Sound Silence Mute Toggled: " + isMuted);
    }
}