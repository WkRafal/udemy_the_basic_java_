package com.exemple.basic.data.types;

public class J09_String {
    public static void main(String[] args) {
        String s1 = "string #1";
        String s2 = " str #2";

        String s3 = s1 + s2;
        System.out.println(s3.toUpperCase());
        System.out.println(s3.length());

        String s4 = "wiersz #1 \n \t wiersz #2 \n \\ \" \u263A";
        System.out.println(s4);
    }
}
