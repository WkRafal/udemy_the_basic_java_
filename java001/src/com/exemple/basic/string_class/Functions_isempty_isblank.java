package com.exemple.basic.string_class;

public class Functions_isempty_isblank {
    public static void main(String[] args) {

        String emptyStr = "";
        String blankStr = "   \n  ";

        if (emptyStr.isEmpty())
            System.out.println("jest pusty");
        else
            System.out.println("nie jest pusty");

        if (emptyStr.isBlank())
            System.out.println("jest pusty");
        else
            System.out.println("nie jest pusty");

        if (blankStr.isEmpty())
            System.out.println("jest pusty");
        else
            System.out.println("nie jest pusty");

        if (blankStr.isBlank())
            System.out.println("jest pusty");
        else
            System.out.println("nie jest pusty");
    }
}
