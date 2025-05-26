import java.util.Date;

public class TrafficSensor {
    private String id;
    private String location;
    private boolean status;
    private int trafficLevel;
    private Date lastUpdated;

    public TrafficSensor(String id, String location) {
        this.id = id;
        this.location = location;
        this.status = true;
        this.trafficLevel = 0;
        this.lastUpdated = new Date();
    }

    public String collectData() {
        return "Sensor " + id + " at " + location + 
               " reports level " + trafficLevel + 
               " (active: " + status + ")";
    }

    public void updateStatus(boolean isActive) {
        this.status = isActive;
        this.lastUpdated = new Date();
    }

    public void setTrafficLevel(int level) {
        this.trafficLevel = level;
        this.lastUpdated = new Date();
    }
}
