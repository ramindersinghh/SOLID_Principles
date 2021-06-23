//I - Interface Segregation Principle
public class Drone extends Vehicle implements CameraSwitch {

    private boolean cameraOn;

    public Drone(int maxFuel) {
        super(maxFuel);
    }

    public boolean isCameraOn() {
        return cameraOn;
    }

    @Override
    public void turnCameraOn() {
        cameraOn = true;
    }

    @Override
    public void turnCameraOff() {
        cameraOn = false;
    }

    //LSP

        // A plane can reverse engine gear while moving forward, no problem here
}