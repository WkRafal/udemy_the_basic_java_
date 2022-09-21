package com.exemple.basic.string_class;

public class Funtion_lastIndexOf {
    public static void main(String[] args) {

        String str = "raz dwa trzy cztery. raz dwa.";

        int index = str.lastIndexOf("raz");
        System.out.println(index);
        String fragment = str.substring(index);
        System.out.println(fragment);

        index = str.indexOf("raz");
        System.out.println(index);
    }
}
