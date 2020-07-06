package com.modernjava.functiolanPrograming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Predicate<Instructor> p1 = Instructor::isOnlineCourses;
        instructors.stream()
                .filter(p1)
                .forEach(System.out::println);

        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(25));

        Function<String, String> lowerCaseFunction = String::toLowerCase;
        System.out.println(lowerCaseFunction.apply("KOKOMAROKO"));
    }
}
