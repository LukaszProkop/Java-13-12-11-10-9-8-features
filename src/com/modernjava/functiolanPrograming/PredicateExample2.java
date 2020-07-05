package com.modernjava.functiolanPrograming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Predicate<Instructor> p1 = i -> i.isOnlineCourses();
        Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10;
        instructors.forEach(instructor -> {
            if (p1.test(instructor)) {
                System.out.println(instructor);
            }
        });

        System.out.println();

        // is instructor teach online and experience is >10 years
        instructors.forEach(instructor -> {
            if (p1.and(p2).test(instructor)){
                System.out.println(instructor);
            }
        });
    }
}
