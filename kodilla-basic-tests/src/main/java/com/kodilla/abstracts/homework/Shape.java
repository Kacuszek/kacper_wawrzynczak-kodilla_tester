package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;

public abstract class Shape {
    private int aSide;
    private int bSide;
    private int height;

    public Shape(int aSide, int bSide, int height) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.height = height;
    }
    public int getaSide() {
        return aSide;
    }
    public int getbSide() {
        return bSide;
    }
    public int getHeight() {
        return height;
    }
    public abstract void perimeter();
    public abstract void area();
}
