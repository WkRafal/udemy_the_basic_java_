package com.exemple.basic.data;

public class NumbersConversion {
    public static void main(String[] args) {
        //konwersja jawna zawężająca
        int i = 5;
        double d = 28.0 / (double)i;
        System.out.println(d);

        //konwersja niejawna rozszeżająca
        int a = 4;
        double b = 10.0 / a;
        System.out.println(b);

        double d2 = 5.0;
        int num = 10 * (int)d2;
        System.out.println(num);

        byte small = (byte)220;//powoduje utrate informacji
        System.out.println(small);
    }
}
