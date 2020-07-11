package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Instructor> list = Instructors.getAll().stream()
                .filter(instructor -> instructor.getYearsOfExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
