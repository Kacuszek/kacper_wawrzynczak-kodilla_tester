package com.kodilla.inheritance.homework;

public class Phone {
    public static void main (String[] args){
        Android android = new Android(2017);
        android.turnOn();

        Ios ios = new Ios(2020);
        ios.turnOff();
    }
}
