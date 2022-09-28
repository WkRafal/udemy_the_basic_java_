package com.exemple.oop.basic.interface_mouse_listener;

import javax.swing.*;

public class JFrameExample {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setSize(300, 300);
        frame.setTitle("przyklad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addMouseListener(frame);
    }
}
