public class Drone extends Vehicle {

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

    @Override
    public void turnRadioOn() {
        // nothing to do here
    }

    @Override
    public void turnRadioOff() {
        // nothing to do here
    }
    //LSP
    // A plane can reverse engine gear while moving forward, no problem here

}