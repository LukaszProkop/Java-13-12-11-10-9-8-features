package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        //min, minBy
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println("instructor = " + instructor);

        System.out.println("----------------");

        instructor = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructor = " + instructor);

        System.out.println("\n####################\n");

        //max, maxBy
        instructor = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println("instructor = " + instructor);

        System.out.println("----------------");

        instructor = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructor = " + instructor);
    }
}
