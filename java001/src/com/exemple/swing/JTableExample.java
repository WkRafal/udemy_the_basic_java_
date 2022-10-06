package com.exemple.swing;

import javax.swing.*;
import java.awt.*;

public class JTableExample extends JFrame {
    public static void main(String[] args) {
        JTableExample frame = new JTableExample();

        String columns[] = {"manufacturer","name","year","topSpeed"};
        String data[][] ={
                {"Ford","T","1921","70"},
                {"Merc","GLE","2021","250"}
        };

        JTable table = new JTable(data,columns);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(300,100));

        frame.add(pane,BorderLayout.CENTER);
        frame.pack();

        table.setValueAt("35",0,3);
        System.out.println(table.getValueAt(1,1));
        System.out.println("column count: " + table.getColumnCount());
        System.out.println("column name: " + table.getColumnName(0));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
