package com.exemple.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupMenuExample extends JFrame {
    public static void main(String[] args) {
        JPopupMenuExample frame = new JPopupMenuExample();

        JPopupMenu popupMenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem pasty = new JMenuItem("Pasty");
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(pasty);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem item = (JMenuItem) e.getSource();
                System.out.println("clicked: " + item.getText());

            }
        };

        cut.addActionListener(listener);
        copy.addActionListener(listener);
        pasty.addActionListener(listener);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(frame, e.getX(), e.getY());
            }
        });

        frame.add(popupMenu);

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
