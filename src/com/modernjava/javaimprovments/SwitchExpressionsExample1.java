package com.modernjava.javaimprovments;

public class SwitchExpressionsExample1 {
    public static void main(String[] args) {
        String month = "JANUARY";
        String quoter = switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "FIRST QUARTER";
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quoter = " + quoter);
    }
}
