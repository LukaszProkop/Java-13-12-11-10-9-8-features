package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample2 {
    public static void main(String[] args) {
        List<String> names = Instructors.getAll()
                .stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.filtering(s -> s.contains("e"),
                                Collectors.toList())));
        System.out.println("result = " + result);

        System.out.println("-----------");

        Map<String, List<Instructor>> instructorByExperienceAndOnline = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(instructor ->
                        instructor.getYearsOfExperience()>10 ? "SENIOR" : "JUNIOR",
                        Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())));
        instructorByExperienceAndOnline.forEach((key,value)->
                System.out.println("key = " + key + " value = " + value));
    }
}
