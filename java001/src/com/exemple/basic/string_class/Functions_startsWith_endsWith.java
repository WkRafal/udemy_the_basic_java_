package com.exemple.basic.string_class;

public class Functions_startsWith_endsWith {
    public static void main(String[] args) {

        String str = "java program";

        System.out.println((str.startsWith("php")) ? "tak" : "nie");
        System.out.println((str.startsWith("java")) ? "tak" : "nie");
        System.out.println((str.endsWith("php")) ? "tak" : "nie");
        System.out.println((str.endsWith("program")) ? "tak" : "nie");
    }
}
