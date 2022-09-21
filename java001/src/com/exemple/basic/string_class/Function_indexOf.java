package com.exemple.basic.string_class;

public class Function_indexOf {
    public static void main(String[] args) {

        String str = "raz dwa trzy cztery";

        int index = str.indexOf("dwa trzy");
        System.out.println(index);

        index = str.indexOf("piec");
        System.out.println(index);

        index = str.indexOf("trzy", 10);
        System.out.println(index);
    }
}
