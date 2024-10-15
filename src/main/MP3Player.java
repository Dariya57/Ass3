package src.main;

class MP3Player implements AudioPlayerInterface {
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            System.out.println("Invalid audio format for MP3Player: " + audioType);
        }
    }
}
