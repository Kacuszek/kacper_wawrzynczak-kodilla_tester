package com.kodilla.inheritance.homework;

public class Ios extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Ios was turned on");
    }

    public void turnOff() {
        System.out.println("Ios was turned off");
    }

    public Ios(int yearOfProduction) {
        super(yearOfProduction);
    }
}
