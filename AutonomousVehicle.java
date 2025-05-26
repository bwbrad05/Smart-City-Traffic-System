public class AutonomousVehicle extends Vehicle implements Navigable {
    private int aiLevel;

    public AutonomousVehicle(String licensePlate, float speed, int aiLevel) {
        super(licensePlate, speed);
        this.aiLevel = aiLevel;
    }

    public void selfDrive() {
        System.out.println("Autonomous vehicle " + licensePlate + " is self-driving.");
    }

    public void stopAutomatically() {
        speed = 0;
        System.out.println("Autonomous vehicle " + licensePlate + " stopped automatically.");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Navigating to " + destination);
    }

    @Override
    public void reroute() {
        System.out.println("Rerouting...");
    }
}