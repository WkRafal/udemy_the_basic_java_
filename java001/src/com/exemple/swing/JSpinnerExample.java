package com.exemple.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSpinnerExample extends JFrame {
    public static void main(String[] args) {
        JSpinnerExample frame = new JSpinnerExample();

        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(10,-5,15,1);
        JSpinner spinner =new JSpinner(spinnerModel);

        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("spinner: " + spinner.getValue());
            }
        });

        frame.add(spinner);

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
