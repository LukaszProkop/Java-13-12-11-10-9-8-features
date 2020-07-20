package com.modernjava.factorymathods;

import java.util.*;

public class FactoryMethodsExample {
    public static void main(String[] args) {
        //How we used to create unmodifiable list pre java 9
        List<String> names = new ArrayList<>();
        names.add("Syed");
        names.add("Mike");
        names.add("Jenny");
        names = Collections.unmodifiableList(names);
        System.out.println("names = " + names);

        //factory methods of java 9

        List<String> names1 = List.of("Syed", "Mike", "Jenny");
        System.out.println("names1 = " + names1);
        Set<String> set = Set.of("Syed", "Mike", "Jenny");
        System.out.println("set = " + set);
        Map<String, String> map = Map.of("Grade1", "Syed", "Grade2", "Mike");
        System.out.println("map = " + map);
    }
}
