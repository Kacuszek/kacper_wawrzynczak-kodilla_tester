package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("cleaning room", LocalDate.of(2021,01,02), LocalDate.of(2021,06,03) ));
        tasks.add(new Task("washing dishes", LocalDate.of(2021,02,03), LocalDate.of(2021,06,04)));
        tasks.add(new Task("vacuuming", LocalDate.of(2021,03,05), LocalDate.of(2021,06,10)));
        return tasks;
    }
}
