package com.zemoso;

public class Economy implements DrivingMode {

    private static final int POWER = 300;

    @Override
    public int getPower() {
        return POWER;
    }
}