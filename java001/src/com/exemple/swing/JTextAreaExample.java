package com.exemple.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JTextAreaExample extends JFrame {
    public static void main(String[] args) {

        JTextFieldExample frame = new JTextFieldExample();

        JTextArea t = new JTextArea(3,14);
        JScrollPane jScrollPane = new JScrollPane(t);

        t.append("lorem ipsum");
        t.append("another tekst");
        t.insert("hello", 0);
        t.setLineWrap(true);

        t.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertUpdate: " + t.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("removeUpdate: " + t.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("changedUpdate: " + t.getText());
            }
        });

        frame.add(jScrollPane);

        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
