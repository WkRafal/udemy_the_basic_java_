package com.exemple.basic.programs;

import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("podaj imie");
        String name = in.nextLine();

        System.out.println("twoje imie: " + name);
    }
}
