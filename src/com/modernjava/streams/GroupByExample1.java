package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample1 {
    public static void main(String[] args) {
        List<String> names = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("result = " + result);

        System.out.println("------------------");

        Map<String, List<Instructor>> instructorByGender = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
        instructorByGender.forEach((key,value)->System.out.println("key = " + key + " value = " + value));

        System.out.println("------------------");

        Map<String, List<Instructor>> instructorByExperience = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(
                        instructor -> instructor.getYearsOfExperience()>10 ? "SENIOR" : "JUNIOR"));
        instructorByExperience.forEach((key, value)-> System.out.println("key = " + key + " value = " + value));

    }

}
