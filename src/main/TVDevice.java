package src.main;

public class TVDevice implements Device {
    public void powerOn() {
        System.out.println("TV is ON");
    }

    public void powerOff() {
        System.out.println("TV is OFF");
    }

    public void setChannel(int channel) {
        System.out.println("TV set to channel " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}
