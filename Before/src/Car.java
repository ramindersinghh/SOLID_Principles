public class Car extends Vehicle {

    private boolean radioOn;

    public Car(int maxFuel) {
        super(maxFuel);
    }

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }

    @Override
    public void turnCameraOn() {
        // nothing to do here
    }

    @Override
    public void turnCameraOff() {
        // nothing to do here
    }

    @Override
    public void changeGear(Gear gear) { // LSP
        if(Gear.R.equals(gear) && getGear().equals(Gear.D)){
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
    }

}