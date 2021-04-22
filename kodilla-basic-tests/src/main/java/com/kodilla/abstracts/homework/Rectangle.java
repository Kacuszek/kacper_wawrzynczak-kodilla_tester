package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle(){
        super(4, 5, 4);
    }

    @Override
    public void perimeter() {
        int result = 2 * getaSide() + 2 * getbSide();
        System.out.println(result);

    }

    @Override
    public void area() {
        int result = getaSide() * getbSide();
        System.out.println(result);

    }
}
