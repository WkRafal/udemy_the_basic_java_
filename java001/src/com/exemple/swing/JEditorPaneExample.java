package com.exemple.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JEditorPaneExample extends JFrame {
    public static void main(String[] args) {
        JEditorPaneExample frame = new JEditorPaneExample();

        JEditorPane editorPane = new JEditorPane(
                "text/html",
                "<html><h2>title</h2>" +
                        "<p>lorem ipsum</p></html>"
        );

        editorPane.setEditable(true);
        editorPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insert update");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("remove update " + editorPane.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("change update");
            }
        });


        JScrollPane scrollPane = new JScrollPane(editorPane);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
