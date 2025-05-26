public class Car extends Vehicle {
    private boolean hasSunroof;

    public Car(String licensePlate, float speed, boolean hasSunroof) {
        super(licensePlate, speed);
        this.hasSunroof = hasSunroof;
    }

    public void playMusic() {
        System.out.println("Playing music in car " + licensePlate);
    }
}