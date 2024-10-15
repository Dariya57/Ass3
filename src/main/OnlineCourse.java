package src.main;

public class OnlineCourse {
    private List<VideoLecture> videoLectures = new ArrayList<>();

    public void addVideoLecture(VideoLecture videoLecture) {
        videoLectures.add(videoLecture);
    }

    public void playAllLectures() {
        for (VideoLecture videoLecture : videoLectures) {
            videoLecture.play();
        }
    }

}