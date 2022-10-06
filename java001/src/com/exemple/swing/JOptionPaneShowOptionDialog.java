package com.exemple.swing;

import javax.swing.*;

public class JOptionPaneShowOptionDialog {
    public static void main(String[] args) {

        String options[] = {"save", "load latest", "compile", "abort"};

        int result = JOptionPane.showOptionDialog(
                null,
                "what to do with project?",
                "project 001",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]
        );
        System.out.println("wybrano: " + options[result]);

        JTextArea area = new JTextArea(8,16);
        JTextField email = new JTextField(10);
        Object options2[] = {
                new JLabel("Email"),
                email,
                "Send",
                "Cancel"
        };

        int result2 = JOptionPane.showOptionDialog(
                null,
                area,
                "send mail",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[2]
        );

        System.out.println("text area: " + area.getText());
        System.out.println("email: " + email.getText());
        System.out.println("wybrano: " + options2[result2]);
    }
}
