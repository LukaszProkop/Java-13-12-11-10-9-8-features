package com.modernjava.lambda;

public class HelloWorldOldTraditional implements HelloWordInterface {

    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldOldTraditional helloWorldOldTraditional = new HelloWorldOldTraditional();
        System.out.println(helloWorldOldTraditional.sayHelloWorld());
    }
}
