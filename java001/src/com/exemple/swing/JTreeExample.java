package com.exemple.swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

public class JTreeExample extends JFrame {
    public static void main(String[] args) {
        JTreeExample frame = new JTreeExample();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        JTree tree = new JTree(root);
        DefaultMutableTreeNode cars = new DefaultMutableTreeNode("cars");
        root.add(cars);
        cars.add(new DefaultMutableTreeNode("ford"));
        cars.add(new DefaultMutableTreeNode("audi"));
        cars.add(new DefaultMutableTreeNode("merc"));

        DefaultMutableTreeNode bikes = new DefaultMutableTreeNode("bikes");
        root.add(bikes);
        bikes.add(new DefaultMutableTreeNode("romet"));
        bikes.add(new DefaultMutableTreeNode("kross"));

        for (int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }

        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                Object el = e.getNewLeadSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) el;
                System.out.println("selected: " + node.toString());
            }
        });

        frame.add(tree);


        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
