package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kacper Wawrzyńczak", new Teacher("Mariusz Bronisz")));
        students.add(new Student("Natalia Lewandowska", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teachers = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Students name: " + student.getName() + "--> name of Teacher: " + teachers);
        }

    }
}
