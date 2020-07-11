package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .collect(Collectors.toList());
        instructors.forEach(System.out::println);
    }
}
