package com.modernjava.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(0, 1000).sum();
        System.out.println("sum of 1000 numbers is: " + sum);

        OptionalInt min = IntStream.rangeClosed(0, 1000).min();
        if (min.isPresent())
            System.out.println("minimum of 1000 numbers is: " + min.getAsInt());

        OptionalInt max = IntStream.rangeClosed(0, 1000).max();
        if (max.isPresent())
            System.out.println("Max of 1000 numbers is: " + max.getAsInt());

        OptionalDouble average = LongStream.rangeClosed(0, 1000).asDoubleStream().average();
        System.out.println("average of 1000 numbers is: " + (average.isPresent() ? average.getAsDouble() : 0.0));
    }
}
