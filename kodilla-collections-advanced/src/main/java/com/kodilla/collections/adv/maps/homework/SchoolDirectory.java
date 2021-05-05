package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();
        Principal carl = new Principal("Carl", "Johnson");
        Principal simon = new Principal("Simon", "Smith");

        School carlSchool = new School(23.0, 21.0, 30.0, 28.0);
        School simonSchool = new School(22.0, 27.0, 25.0, 28.0);

        directory.put(carl, carlSchool);
        directory.put(simon, simonSchool);

        for (Map.Entry<Principal, School> principalEntry : directory.entrySet())
            System.out.println(principalEntry.getKey().getLastname() + ", sum of Students:" + principalEntry.getValue().getSumOfStudents());
    }
}
