package com.zemoso;

public class Comfort implements DrivingMode {

    private static final int POWER = 400;

    @Override
    public int getPower() {
        return POWER;
    }

}