package com.exemple.basic.string_class;

public class FunctionTrim {
    public static void main(String[] args) {

        String str = "  \n   Hello World   ";
        String str2 = str.trim();
        System.out.println("\"" + str2 + "\"");

        String str3 = str.stripLeading();
        System.out.println("\"" + str3 + "\"");

        String str4 = str.stripTrailing();
        System.out.println("\"" + str4 + "\"");


    }
}
