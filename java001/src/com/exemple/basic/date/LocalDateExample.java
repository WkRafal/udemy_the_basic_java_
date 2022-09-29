package com.exemple.basic.date;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfYear());

        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());

        localDate = localDate.plusYears(1);
        localDate = localDate.minusDays(12);
        localDate = localDate.plusWeeks(6);
        System.out.println("data po zmianach");
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfYear());

        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());
    }
}
