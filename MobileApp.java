public class MobileApp {
    private String userId;
    private String currentLocation;

    public String requestTrafficUpdate() {
        return "Traffic update requested for " + currentLocation;
    }
}