package com.exemple.basic.string_class;

public class StringsComparison {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELlo";

        if (s2.equals(s1)) System.out.println("s2 rowne s1");

        if (s3.equals(s1)) System.out.println("s3 rowne s1");

        if (s1.equalsIgnoreCase(s3)) System.out.println("s2 rowne s1 - wielkosc znakow ignorowana");

        System.out.println((s1.equals(s3) ? "rowny" : "nierowny"));
    }
}
