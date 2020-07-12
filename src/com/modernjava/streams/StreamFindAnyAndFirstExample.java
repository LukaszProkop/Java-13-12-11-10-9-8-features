package com.modernjava.streams;

import com.modernjava.functiolanPrograming.Instructor;
import com.modernjava.functiolanPrograming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll().stream()
                .findAny();
        instructorOptional.ifPresent(System.out::println);

        instructorOptional = Instructors.getAll().stream()
                .findFirst();
        instructorOptional.ifPresent(System.out::println);
    }
}
