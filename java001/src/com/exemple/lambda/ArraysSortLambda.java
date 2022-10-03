package com.exemple.lambda;

import java.util.Arrays;

public class ArraysSortLambda {
    public static void main(String[] args) {

        String arrStr[] = {"Ford","Bmw","Mercedes","Dogde"};

        Arrays.sort(arrStr, (a ,b) -> {return a.length() - b.length();});

       for (String s : arrStr)
           System.out.println(s);
    }
}
