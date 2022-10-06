package com.exemple.swing;

import javax.swing.*;
import java.awt.*;

public class JSplitPaneExample extends JFrame {
    public static void main(String[] args) {
        JSplitPaneExample frame = new JSplitPaneExample();

        JPanel p1 = new JPanel();
        String cars[] = {"ford","audi"};
        p1.add(new JComboBox<String>(cars));

        JPanel p2 = new JPanel();
        String bikes[] = {"romet","kross"};
        p2.add(new JComboBox<String>(bikes));


        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1,p2);
                ;

        frame.add(splitPane, BorderLayout.CENTER);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
