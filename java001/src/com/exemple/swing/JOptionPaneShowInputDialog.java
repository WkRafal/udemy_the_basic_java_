package com.exemple.swing;

import javax.swing.*;

public class JOptionPaneShowInputDialog {
    public static void main(String[] args) {

//        String result = JOptionPane.showInputDialog(
//                null,
//                "wpisz swoje imie"
//        );
//
//        System.out.println("imie: " + result);

        String cars[] = {"ford", "merc", "audi"};
        String result = (String) JOptionPane.showInputDialog(
                null,
                null,
                "wybierz samochod",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cars,
                cars[0]
        );

        System.out.println("wybrane auto: " + result);
    }
}
