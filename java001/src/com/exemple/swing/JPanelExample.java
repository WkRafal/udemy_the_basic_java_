package com.exemple.swing;

import com.exemple.oop.basic.interface_basics.Car;

import javax.swing.*;
import java.awt.*;

public class JPanelExample extends JFrame {
    public static void main(String[] args) {
        JPanelExample frame = new JPanelExample();

        JPanel panel= new JPanel();
        panel.setBackground(Color.CYAN);
        panel.add(new JLabel("label"));
        panel.add(new JButton("click"));
        panel.setPreferredSize(new Dimension(150,150));

        frame.add(panel);

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
