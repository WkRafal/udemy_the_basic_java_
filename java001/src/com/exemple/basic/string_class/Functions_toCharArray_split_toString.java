package com.exemple.basic.string_class;

public class Functions_toCharArray_split_toString {
    public static void main(String[] args) {

        String str = "ola ma kota";

        char arr[] = str.toCharArray();
        System.out.println("liczba znakow:" + arr.length);

        String strArr[] = str.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        String s = str.toString();
        System.out.println(s);

        System.out.println(strArr.toString());

        Integer i = new Integer(123);
        System.out.println(i.toString());

        String text = "liczba " + i;
        System.out.println(text);
    }
}
