package com.exemple.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderExample extends JFrame {
    public static void main(String[] args) {
        JSliderExample frame =new JSliderExample();

        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,5);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("slider: " + slider.getValue());
            }
        });

        frame.add(slider);

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
