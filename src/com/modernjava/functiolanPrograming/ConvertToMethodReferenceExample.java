package com.modernjava.functiolanPrograming;

import java.util.List;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Instructors.getAll()
                .stream()
                .filter(ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience)
                .forEach(System.out::println);
    }

    public static boolean greaterThanTenYearsOfExperience(Instructor instructor) {
        if (instructor.getYearsOfExperience() > 10){
         return true;
        }
        return false;
    }
}
