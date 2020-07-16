package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
    public static void main(String[] args) {
        Map<Boolean, Optional<Instructor>> maxInstructor = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));
        maxInstructor.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));

        System.out.println("---------------");

        //average years of experience of instructor who teach online or not
        Map<Boolean, Double> maxInstructor1 = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.averagingInt(Instructor::getYearsOfExperience)));
        maxInstructor1.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));

        System.out.println("---------------");

        //collectingAndThen
        Map<Boolean, Instructor> maxInstructor2 = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)),
                                Optional::get)));
        maxInstructor2.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));

        System.out.println("---------------");

        //drive a statistical summary from properties of grouped items
        Map<Boolean, IntSummaryStatistics> maxInstructor3 = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.summarizingInt(Instructor::getYearsOfExperience)));
        maxInstructor3.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
    }
}
