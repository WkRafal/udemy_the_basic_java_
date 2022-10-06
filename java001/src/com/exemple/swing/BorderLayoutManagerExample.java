package com.exemple.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutManagerExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        Border border = BorderFactory.createLineBorder(Color.black);

        JLabel north = new JLabel("north",JLabel.CENTER);
        north.setBorder(border);
        frame.add(north,BorderLayout.NORTH);

        JLabel west = new JLabel("west",JLabel.CENTER);
        west.setBorder(border);
        frame.add(west,BorderLayout.WEST);

        JLabel east = new JLabel("east",JLabel.CENTER);
        east.setBorder(border);
        frame.add(east,BorderLayout.EAST);

        JLabel south = new JLabel("south",JLabel.CENTER);
        south.setBorder(border);
        frame.add(south,BorderLayout.SOUTH);


        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
