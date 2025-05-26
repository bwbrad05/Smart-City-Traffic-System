public class TrafficController {
    private String controllerId;
    private String area;
    private TrafficSensor sensor;

    public TrafficController(String controllerId, String area, TrafficSensor sensor) {
        this.controllerId = controllerId;
        this.area = area;
        this.sensor = sensor;
    }

    public void processSensorData() {
        System.out.println("[" + area + "] " + sensor.collectData());
    }

    public void controlLights(String strategy) {
        System.out.println("Controller " + controllerId + 
                           " adjusting lights with strategy: " + strategy);
    }
}
