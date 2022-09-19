package com.exemple.basic.operators;

public class Op2_inkrementetion {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);

        int b = 5;
        int c = 10 + b++;//ink. przyrostkowa
        System.out.println("c=" + c);
        System.out.println("b=" + b);

        int d = 5;
        int e = 10 + ++d;//ink. przedrostkowa
        System.out.println("d=" + d);
        System.out.println("e=" + e);



    }
}
