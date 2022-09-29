package com.exemple.basic.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022,06,23);
        LocalDate date2 = LocalDate.of(2022,7,12);

        if (date1.isAfter(date2))
            System.out.println("1 > 2");
        else
            System.out.println(" nie 1 > 2");

        if (date1.isBefore(date2))
            System.out.println("1 < 2");
        else
            System.out.println("nie 1 < 2");

        if (date1.isEqual(date2))
            System.out.println("1 = 2");
        else
            System.out.println("nie 1 = 2");

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2022,10,6,12,56);

        if (localDateTime1.isAfter(localDateTime2))
            System.out.println("przyszlosc");
    }
}
