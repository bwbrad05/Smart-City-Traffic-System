public class Road {
    private String name;
    private float length;

    public void connectTo(Road road) {
        System.out.println("Connecting " + name + " to " + road.name);
    }
}