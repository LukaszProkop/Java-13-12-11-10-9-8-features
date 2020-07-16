package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        Long instructors = Instructors.getAll().stream()
                .count();
        System.out.println("instructors = " + instructors);

        Long instructors1 = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .collect(Collectors.counting());
        System.out.println("instructors1 = " + instructors1);
    }
}
