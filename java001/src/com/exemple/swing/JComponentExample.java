package com.exemple.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

class TestJComponent extends JComponent {
    Image img;
    public TestJComponent() {
        super();
        img = new ImageIcon("files\\wodospad.jpg").getImage();
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Tekst",5,10);
        g.setFont(new Font("Arial", Font.BOLD, 16));

        g.setColor(Color.lightGray);
        g.fillRect(30,50,100,20);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, 40,80,100,70,this);

        g2d.setColor(Color.RED);
        g2d.draw(new Line2D.Float(0.0f, 10.0f, 220.0f,200.5f));
        g2d.draw(new Rectangle2D.Float(10.0f,20.0f,50.0f,100.0f));

        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(new Ellipse2D.Float(30.0f,50.0f,80.0f,50.0f));

        g2d.draw(new RoundRectangle2D.Double(50,40,100,40,10,10));

        GradientPaint gp = new GradientPaint(5,5, Color.YELLOW, 20,25,Color.RED,true);
        g2d.setPaint(gp);
        g2d.fillRect(60,80,100,50);

    }
}

public class JComponentExample extends JFrame {
    public static void main(String[] args) {
        JComponentExample frame = new JComponentExample();

        TestJComponent component = new TestJComponent();
        frame.add(component);

        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
