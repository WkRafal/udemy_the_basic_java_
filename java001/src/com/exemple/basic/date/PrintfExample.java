package com.exemple.basic.date;

import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {

        // %t + np c
        System.out.printf("Hello %s - %d  - %f - %b - %tc", "World", 12, 5.6, true, new Date());

        System.out.printf("%n %n Hello %s %2$tY.%2$td.%2$tm", "World", new Date());

        String str = String.format("%n %1$tT", new Date());
        System.out.println(str);

        str = String.format("%n %1$tH-%1$tM-%1$tS", new Date());
        System.out.println(str);

    }
}
