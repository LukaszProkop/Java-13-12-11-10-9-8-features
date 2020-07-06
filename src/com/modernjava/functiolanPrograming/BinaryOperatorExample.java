package com.modernjava.functiolanPrograming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2, 4));

        Comparator<Integer> comparator = (a,b)->a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(7,8));

        BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
        System.out.println(minBi.apply(7,8));

        IntBinaryOperator intBi = (a,b)->a*b;
        System.out.println(intBi.applyAsInt(2,4));

        LongBinaryOperator longBi = (a,b)->a*b;
        System.out.println(longBi.applyAsLong(2000000, 50000000));

        DoubleBinaryOperator doubleBi = (a,b)->a*b;
        System.out.println(doubleBi.applyAsDouble(222.666666, 555.4444444));
    }
}
