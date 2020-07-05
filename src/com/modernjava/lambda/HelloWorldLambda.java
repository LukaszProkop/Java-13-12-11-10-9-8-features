package com.modernjava.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWordInterface helloWordInterface = () -> "Hello World";

        System.out.println(helloWordInterface.sayHelloWorld());
    }
}
