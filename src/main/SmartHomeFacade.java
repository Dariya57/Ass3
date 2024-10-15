package src.main;

public class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Lights lights, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void arriveHome() {
        System.out.println("Arriving Home...");
        lights.on();
        thermostat.setTemperature(22);
        securitySystem.disarm();
    }
    public void leaveHome() {
        System.out.println("Leaving Home...");
        lights.off();
        thermostat.setTemperature(18);
        securitySystem.arm();
    }

    public void nightMode() {
        System.out.println("Activating Night Mode...");
        lights.off();
        thermostat.setTemperature(20);
        securitySystem.arm();
    }

    public void movieMode() {
        System.out.println("Activating Movie Mode...");
        lights.off();
        thermostat.setTemperature(22);
        entertainmentSystem.playMovie();
    }

}