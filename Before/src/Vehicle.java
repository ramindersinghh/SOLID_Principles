public class Vehicle implements Switches{

    private final int maxFuel;
    private int remainingFuel;

    private int power;
    private Gear gear;


    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    // this is not a car's responsibility.-- hence not following Single Responsibility P
    // fuel pump class added to solve this in After Code
    public void reFuel(){
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        remainingFuel--; power++;
    }

    public int getPower() {
        return power;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    //LSP
    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

    @Override
    public void turnRadioOn() {

    }

    @Override
    public void turnRadioOff() {

    }

    @Override
    public void turnCameraOn() {

    }

    @Override
    public void turnCameraOff() {

    }
}