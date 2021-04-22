package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() {
        super(2, 2, 2);
    }
    @Override
    public void perimeter() {
        int result = getaSide() *4;
        System.out.println(result);

    }

    @Override
    public void area() {
        int result = getaSide() * getbSide();
        System.out.println(result);

    }
}
