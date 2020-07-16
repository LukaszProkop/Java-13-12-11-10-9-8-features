package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
    public static void main(String[] args) {
        int sum = Instructors.getAll().stream()
                .collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println("sum = " + sum);

        System.out.println("------------");

        double average = Instructors.getAll().stream()
                .collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("average = " + average);
    }
}
