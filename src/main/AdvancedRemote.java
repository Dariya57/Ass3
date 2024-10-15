package src.main;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void powerOn() {
        device.powerOn();
    }

    public void powerOff() {
        device.powerOff();
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Muting the device.");
        device.setVolume(0);
    }
}
