package com.modernjava.functiolanPrograming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //Looping through all the instructor and printing out the values of instructor
        instructors.forEach(c1 -> System.out.println(c1));

        System.out.println();

        //Loop through all the instructor and only print their name
        instructors.forEach(c1 -> System.out.println(c1.getName()));

        System.out.println();

        //Loop through all the instructors and print out their names and their courses
        Consumer<Instructor> s1 = c1 -> System.out.println(c1.getCourses());
        Consumer<Instructor> s = c1 -> System.out.print(c1.getName());
        instructors.forEach(s.andThen(s1));

        System.out.println();

        //Loop through all the instructors and print out name if the years of experience is >10
        instructors.stream()
                .filter(c1 -> c1.getYearsOfExperience() > 10)
                .forEach(c1 -> System.out.println(c1.getName()));

        System.out.println();

        /*Loop through all the instructors and print out name and years of experience if years
        of experience is >5 and teaches course online */
        instructors.stream()
                .filter(c1 -> c1.getYearsOfExperience() > 5 && c1.isOnlineCourses())
                .forEach(c1 -> System.out.println(c1.getName()));
    }
}
