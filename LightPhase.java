public class LightPhase {
    private String name;
    private int durationInSeconds;

    public LightPhase(String name, int durationInSeconds) {
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return durationInSeconds;
    }
}
