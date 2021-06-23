
public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        switch (drivingMode){
            case SPORT:
                vehicle.setPower(500);
                break;
            case COMFORT:
                vehicle.setPower(400);
                break;
            default:
                vehicle.setPower(300);
                break;
            // when we need to add another mode (e.g. ECONOMY) 2 classes will change DrivingMode and EventHandler. --
            // So not open for extension.
            //violating Open Close Principle
        }
    }
}
