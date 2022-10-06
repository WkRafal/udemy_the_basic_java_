package com.exemple.swing;

import javax.swing.*;
import java.awt.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.add(new JButton("click"));
        frame.add(new JLabel("label"));

        frame.setLayout(new FlowLayout());
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
