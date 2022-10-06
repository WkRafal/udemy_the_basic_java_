package com.exemple.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JTableDefaultTableModel extends JFrame {
    public static void main(String[] args) {
        JTableDefaultTableModel frame = new JTableDefaultTableModel();

        String columns[] = {"manufacturer","name","year","topSpeed"};
        String data[][] ={
                {"Ford","T","1921","70"},
                {"Merc","GLE","2021","250"}
        };

        DefaultTableModel model = new DefaultTableModel(data,columns);

        JTable table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(300,100));

        frame.add(pane,BorderLayout.CENTER);
        frame.pack();

        model.insertRow(1,new Object[] {"Audi","A6","2002","220"});
        model.insertRow(model.getRowCount(),new Object[] {"Audi","A6","2021","220"});

        table.setCellSelectionEnabled(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) return;
                ArrayList<String> arr = new ArrayList<>();
                int selectionRows[] = table.getSelectedRows();
                int selectionColumns[] = table.getSelectedColumns();

                for (int i = 0; i < selectionRows.length; i++) {
                    for (int j = 0; j < selectionColumns.length; j++) {
                        String selectedData = (String) table.getValueAt(selectionRows[i],
                                selectionColumns[j]);
                        arr.add(selectedData);
                    }
                }

                System.out.println("selected: " + arr);
            }
        });

        table.setShowHorizontalLines(true);
        table.setGridColor(Color.BLUE);

        table.setValueAt("35",0,3);
        System.out.println(table.getValueAt(1,1));
        System.out.println("column count: " + table.getColumnCount());
        System.out.println("column name: " + table.getColumnName(0));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
