package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TasksManager {
    public static LocalDate current = LocalDate.now();
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(u ->u.getDeadline().isBefore(current))
                .map(Task::getDeadline)
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
}
