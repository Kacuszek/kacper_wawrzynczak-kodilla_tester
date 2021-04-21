package com.kodilla.inheritance.homework;

public class Android extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Android was turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Android was turned off");
    }

    public Android (int yearOfProduction) {
        super(yearOfProduction);
    }
}
