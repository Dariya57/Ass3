package src.main;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void powerOn() {
        device.powerOn();
    }

    public void powerOff() {
        device.powerOff();
    }

    public void setChannel(int channel) {
        device.
        setChannel(channel);
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}