public class TrafficLight {
    private String id;
    private LightPhase currentPhase;

    public TrafficLight(String id) {
        this.id = id;
        this.currentPhase = new LightPhase("Red", 30); // default phase
    }

    public void switchPhase(String name, int duration) {
        this.currentPhase = new LightPhase(name, duration);
        System.out.println("Traffic light " + id + " switched to " + name + " for " + duration + " seconds.");
    }

    public void showCurrentPhase() {
        System.out.println("Traffic light " + id + " is currently " + currentPhase.getName() +
                           " for " + currentPhase.getDuration() + " seconds.");
    }
}
