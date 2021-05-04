package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();
        cars.add(new Ford(90));
        cars.add(new Ford(80));
        cars.add(new Ford(70));

        cars.remove(2);
        cars.remove(new Ford(80));

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
