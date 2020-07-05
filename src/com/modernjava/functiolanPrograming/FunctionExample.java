package com.modernjava.functiolanPrograming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("Square root of 64: " + sqrt.apply(64));
        System.out.println("Square root of 81: " + sqrt.apply(81));

        System.out.println();

        Function<String, String> lowercaseFunction = s->s.toLowerCase();
        System.out.println(lowercaseFunction.apply("Programing"));

        System.out.println();

        Function<String, String> concatFunction = s->s.concat(" In Java");

        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMING"));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMING"));
    }
}
