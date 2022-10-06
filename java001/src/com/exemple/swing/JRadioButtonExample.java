package com.exemple.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample extends JFrame {
    public static void main(String[] args) {
        JRadioButtonExample frame = new JRadioButtonExample();

        JRadioButton radio1 = new JRadioButton("Car");
        JRadioButton radio2 =new JRadioButton("play");
        JRadioButton radio3 =new JRadioButton("train");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        frame.add(radio1);
        frame.add(radio2);
        frame.add(radio3);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton b = (JRadioButton) e.getSource();
                System.out.println("clicked: " + b.getText());
                //System.out.println(radio1.isSelected());
            }
        };

        radio1.addActionListener(listener);
        radio2.addActionListener(listener);
        radio3.addActionListener(listener);


        frame.setLayout(new FlowLayout());
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
