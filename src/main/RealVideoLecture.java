package src.main;
class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video lecture: " + title);
    }

    public void getInfo() {
        System.out.println("Video title: " + title);
    }

    public void play() {
        System.out.println("Playing video lecture: " + title);
    }
}