package com.exemple.swing;

import javax.swing.*;
import java.awt.*;

public class JColorChooserExample extends JFrame {
    public static void main(String[] args) {
        JColorChooserExample frame = new JColorChooserExample();

        Color color = JColorChooser.showDialog(frame, "wybierz kolor", Color.BLUE);
        System.out.println("wybrany kolor: " + color);

        JLabel jLabel = new JLabel("label");

        frame.add(jLabel);
        jLabel.setForeground(color);

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
