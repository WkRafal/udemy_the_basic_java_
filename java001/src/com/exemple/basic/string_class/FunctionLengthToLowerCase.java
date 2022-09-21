package com.exemple.basic.string_class;

import java.util.Locale;

public class FunctionLengthToLowerCase {
    public static void main(String[] args) {

        String str = "Ala ma kota";
        System.out.println(str.length());

        char sign = str.charAt(1);
        System.out.println(sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLow = str.toLowerCase();
        System.out.println(strLow);



    }
}
