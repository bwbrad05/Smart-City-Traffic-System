public class ControlCenter {
    private String centerId;
    private String cityZone;

    public void monitorTraffic() {
        System.out.println("Monitoring traffic in zone " + cityZone);
    }

    public void alertIncidents() {
        System.out.println("Alerting incidents in zone " + cityZone);
    }
}