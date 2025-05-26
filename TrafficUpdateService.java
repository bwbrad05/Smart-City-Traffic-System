public class TrafficUpdateService {
    private String apiVersion;

    public String getTrafficData(String location) {
        return "Traffic data for " + location + " from API version " + apiVersion;
    }
}