package com.kodilla.abstracts.homework;

public class Person {
    String name;
    int age;
    String job;

    public void process(Job job) {
        System.out.println(name + "has responsibilities" +job.getResponsibilities());
    }
}
