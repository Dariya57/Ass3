package src.main;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void setChannel(int channel);
    public abstract void setVolume(int volume);
}
