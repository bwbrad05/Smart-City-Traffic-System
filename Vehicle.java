public class Vehicle {
    protected String licensePlate;
    protected float speed;

    public Vehicle(String licensePlate, float speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Vehicle " + licensePlate + " is moving at speed " + speed);
    }

    public void stop() {
        speed = 0;
        System.out.println("Vehicle " + licensePlate + " has stopped.");
    }
}

