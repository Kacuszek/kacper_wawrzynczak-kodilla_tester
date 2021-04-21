package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfProduction;

    public OperatingSystem(int yearOfProduction){
        this.yearOfProduction = yearOfProduction;
    }

    public void turnOn() {
       System.out.println("System was turned on.");
    }

    public void turnOff() {
        System.out.println("System was turn off.");
    }

}
