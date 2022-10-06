package com.exemple.swing;

import javax.print.attribute.standard.JobPriority;
import javax.swing.*;

public class JOptionPaneShowMessageDialog extends JFrame {
    public static void main(String[] args) {
        JOptionPaneShowMessageDialog frame = new JOptionPaneShowMessageDialog();

//        JOptionPane.showMessageDialog(frame,
//                "hello world,",
//                "title",
//                JOptionPane.PLAIN_MESSAGE);

        ImageIcon icon = new ImageIcon("files\\wodospad.jpg");

        JOptionPane.showMessageDialog(null,
                "<html><u>hello world</u></html>",
                "title",
                JOptionPane.ERROR_MESSAGE,
                icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
