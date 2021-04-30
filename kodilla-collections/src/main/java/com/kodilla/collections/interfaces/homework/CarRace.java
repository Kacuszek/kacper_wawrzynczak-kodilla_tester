package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(0);
        doRace(ford);
        Opel opel = new Opel(0);
        doRace(opel);
        Audi audi = new Audi(0);
        doRace(audi);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
