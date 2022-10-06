package com.exemple.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    public void initUI() {
        this.setLayout(new GridLayout());
        button1 = new JButton("click me");
        button1.addActionListener(this);
        this.add(button1);
        button2 = new JButton("also me");
        button2.addActionListener(this);
        this.add(button2);
        button3 = new JButton("also me");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 3 clicked");
            }
        });
        this.add(button3);
    }

    public static void main(String[] args) {
        ActionEventExample frame = new ActionEventExample();

        frame.initUI();

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (button1.equals(e.getSource()))
        System.out.println("click button1");
        if (button2.equals(e.getSource()))
            System.out.println("click button2");
    }
}
