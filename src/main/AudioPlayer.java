package src.main;

public class AudioPlayer implements AudioPlayerInterface {
    AudioAdapter audioAdapter;

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            new MP3Player().play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("wav") || audioType.equalsIgnoreCase("aac")) {
            audioAdapter = new AudioAdapter(audioType);
            audioAdapter.play(audioType, fileName);
        } else {
            System.out.println("Unsupported audio format: " + audioType);
        }
    }
}