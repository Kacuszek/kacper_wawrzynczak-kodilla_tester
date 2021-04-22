package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    public Triangle() {
        super(5, 5, 4);
    }
    @Override
    public void perimeter() {
       int result = getaSide() * 3;
        System.out.println(result);

    }

    @Override
    public void area() {
        int result = getaSide() * getHeight() / 2;
        System.out.println(result);
    }
}
