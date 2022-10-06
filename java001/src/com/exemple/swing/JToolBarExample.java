package com.exemple.swing;

import javax.swing.*;
import java.awt.*;

public class JToolBarExample extends JFrame {
    public static void main(String[] args) {
        JToolBarExample frame =new JToolBarExample();

        JToolBar toolBar = new JToolBar();
        JButton b1 = new JButton("click");
        toolBar.add(b1);

        JToggleButton b2 = new JToggleButton("click me");
        toolBar.add(b2);

        frame.add(toolBar);

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
