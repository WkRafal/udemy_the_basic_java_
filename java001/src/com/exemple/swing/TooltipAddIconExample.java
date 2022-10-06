package com.exemple.swing;

import javax.swing.*;
import java.awt.*;

public class TooltipAddIconExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("click");
        button.setToolTipText("wkliknij");

        Image icon = (new ImageIcon("files\\wodospad.jpg")).getImage();
        frame.setIconImage(icon);

        frame.add(button);

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
