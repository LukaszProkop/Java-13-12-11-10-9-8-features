package com.modernjava.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println("----------");

        System.out.println("ZonedDateTime.now(ZoneId.of(Pacific/Guadalcanal)) = " + ZonedDateTime.now(ZoneId.of("Pacific/Guadalcanal")));
        System.out.println("America/New_York: " + ZonedDateTime.now(ZoneId.of("America/New_York")));
    }
}
