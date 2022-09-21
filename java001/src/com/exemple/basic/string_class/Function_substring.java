package com.exemple.basic.string_class;

public class Function_substring {
    public static void main(String[] args) {

        String str = "Ola ma psa oraz kota";

        String frag1 = str.substring(7);
        System.out.println(frag1);

        String frag2 = str.substring(7, 10);
        System.out.println(frag2);
    }
}
