package com.modernjava.streams;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        LongStream number = LongStream.of(1, 2, 3, 4, 5);
        number.forEach(System.out::println);

        System.out.println("------");

        number = LongStream.iterate(0, i -> i + 2).limit(5);
        number.forEach(System.out::println);

        System.out.println("------");

        number = LongStream.generate(()-> ThreadLocalRandom.current().nextLong(100)).limit(5);
        number.forEach(System.out::println);

        System.out.println("------");

        number = LongStream.range(1, 5);
        number.forEach(System.out::println);

        System.out.println("------");

        number = LongStream.rangeClosed(1,5);
        number.forEach(System.out::println);
    }
}
