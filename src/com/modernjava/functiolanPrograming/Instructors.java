package com.modernjava.functiolanPrograming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll() {
        Instructor instructor1 = new Instructor("Mike", 10, "Software Developer",
                "M", true, Arrays.asList("Java Programing", "C++ Programing", "Python Programing"));

        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer",
                "F", false, Arrays.asList("Multi-Threaded Programing", "CI/CD", "Unit Testing"));

        Instructor instructor3 = new Instructor("Gene", 6, "Manager",
                "M", false, Arrays.asList("C++ Programing", "C Programing", "React Native"));

        Instructor instructor4 = new Instructor("Anthony", 15, "Senior Developer",
                "M", true, Arrays.asList("Java Programing", "Angular Programing", "React Native"));

        Instructor instructor5 = new Instructor("Syed", 15, "Principal Engineer",
                "M", true, Arrays.asList("Java Programing", "Java Multi-Threaded Programing", "React Native"));

        List<Instructor> list = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
        return list;
    }
}
