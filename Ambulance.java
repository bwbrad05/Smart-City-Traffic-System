public class Ambulance extends Vehicle {
    private boolean emergencyMode;

    public Ambulance(String licensePlate, float speed, boolean emergencyMode) {
        super(licensePlate, speed);
        this.emergencyMode = emergencyMode;
    }

    public void alertSirens() {
        System.out.println("Alerting sirens for ambulance " + licensePlate + (emergencyMode ? " (Emergency Mode ON)" : ""));
    }
}