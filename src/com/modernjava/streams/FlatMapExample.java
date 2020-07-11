package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        Set<String> instructorCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        System.out.println(instructorCourses);
    }
}
