public class TrafficCamera {
    private String cameraId;
    private String resolution;

    public Image captureImage() {
        System.out.println("Capturing image with resolution " + resolution);
        return new Image();
    }
}