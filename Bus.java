public class Bus extends Vehicle {
    private int passengerCount;

    public Bus(String licensePlate, float speed, int passengerCount) {
        super(licensePlate, speed);
        this.passengerCount = passengerCount;
    }

    public void openDoors() {
        System.out.println("Opening doors for bus " + licensePlate + " with " + passengerCount + " passengers.");
    }
}