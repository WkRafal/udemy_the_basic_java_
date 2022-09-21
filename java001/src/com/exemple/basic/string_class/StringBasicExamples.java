package com.exemple.basic.string_class;

public class StringBasicExamples {
    public static void main(String[] args) {

        String s1 = "Hello World";
        char test = 'j';
        String s2 = new String("string passed to construktor");

        String s3 = "test".repeat(5);
        System.out.println(s3);

        String s4 = String.join(".", "1", "2", "3", "4");
        System.out.println(s4);

        char[] arr = {'O', 'L', 'A'};
        String s5 = new String(arr);
        System.out.println(s5);

    }
}
