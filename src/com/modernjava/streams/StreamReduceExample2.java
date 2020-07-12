package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        Optional instructor = Instructors.getAll().stream()
                .reduce((s1, s2) -> s1.getYearsOfExperience() > s2.getYearsOfExperience() ? s1 : s2);

        if (instructor.isPresent())
            System.out.println(instructor);
    }
}
