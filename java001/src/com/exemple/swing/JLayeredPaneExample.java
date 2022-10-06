package com.exemple.swing;

import javax.swing.*;
import java.awt.*;

public class JLayeredPaneExample extends JFrame {
    public static void main(String[] args) {
        JLayeredPaneExample frame = new JLayeredPaneExample();

        JLayeredPane layeredPane = frame.getLayeredPane();
        JButton b1 = new JButton();
        b1.setBounds(10,10,50,50);
        b1.setBackground(Color.RED);
        layeredPane.add(b1,7);

        JButton b2 = new JButton();
        b2.setBounds(15,30,50,100);
        b2.setBackground(Color.CYAN);
        layeredPane.add(b2,3);

        JButton b3 = new JButton();
        b3.setBounds(20,15,50,20);
        b3.setBackground(Color.GRAY);
        layeredPane.add(b3,15);


        frame.setLayout(null);// ustawiamy bounds
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
