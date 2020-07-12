package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Optional result = numbers.stream()
                .min(Integer::compareTo);
        if(result.isPresent())
            System.out.println(result.get());

        int result1 = numbers.stream()
                .reduce(0, Integer::min);
        System.out.println(result1);

        Optional result2 = numbers.stream()
                .reduce(Integer::min);
        if(result2.isPresent())
            System.out.println(result2.get());
    }
}
