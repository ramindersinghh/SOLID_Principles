package com.zemoso;

public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    private int power;

    private boolean isMoving;
    private Gear gear;


    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
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
        remainingFuel--;
    }

    public int getPower() {
        return power;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    //LSP
    public void move(){
        isMoving = true;
    }

    public void stop(){
        isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }
}