package src.main;

interface AACPlayer {
    void playAAC(String fileName);

    class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
        public void playWAV(String fileName) {
            System.out.println("Playing WAV file: " + fileName);
        }

        public void playAAC(String fileName) {
            System.out.println("Playing AAC file: " + fileName);
        }
    }
}