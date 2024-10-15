package src.main;

import src.main.first.AACPlayer;

class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    public void playWAV(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }

    public void playAAC(String fileName) {
        System.out.println("Playing AAC file: " + fileName);
    }
}
