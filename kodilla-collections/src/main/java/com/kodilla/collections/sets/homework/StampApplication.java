package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stamp with pope", 10.0, 5.0, "stamped"));
        stamps.add(new Stamp("Stamp of Ireland", 8.2, 4.1, "Not stamped"));
        stamps.add(new Stamp("Stamp of Spain", 6.0, 3.0, "Stamped"));
        stamps.add(new Stamp("Stamp with pope", 10.0, 5.0, "stamped"));
        stamps.add(new Stamp("Stamp of Jamaica", 12.6, 6.3, "Stamped"));
        stamps.add(new Stamp("Stamp of Spain", 6.0, 3.0, "Stamped"));


        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
