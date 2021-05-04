package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double widthA;
    private double widthB;
    private String stamped;

    public Stamp(String name, double widthA, double widthB, String stamped) {
        this.name = name;
        this.widthA = widthA;
        this.widthB = widthB;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public double getWidthA() {
        return widthA;
    }

    public double getWidthB() {
        return widthB;
    }

    public String getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.widthA, widthA) == 0 && Double.compare(stamp.widthB, widthB) == 0 && Objects.equals(name, stamp.name) && Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, widthA, widthB, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", widthA=" + widthA +
                ", widthB=" + widthB +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
