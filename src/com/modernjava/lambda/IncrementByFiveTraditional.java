package com.modernjava.lambda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface {

    @Override
    public int interfaceByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveInterface.interfaceByFive(2));
    }
}
