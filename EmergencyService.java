public class EmergencyService {
    protected String serviceId;
    protected int priorityLevel;
    protected TrafficController controller;

    public EmergencyService(String serviceId, int priorityLevel, TrafficController controller) {
        this.serviceId = serviceId;
        this.priorityLevel = priorityLevel;
        this.controller = controller;
    }

    public void requestPriorityPass(String reason) {
        System.out.println(serviceId + " requests priority pass. Reason: " + reason);
        controller.controlLights("priority-" + priorityLevel);
    }

    public void escalate(int newPriority) {
        System.out.println(serviceId + " escalates from priority " + priorityLevel + " to " + newPriority);
        this.priorityLevel = newPriority;
    }
}
