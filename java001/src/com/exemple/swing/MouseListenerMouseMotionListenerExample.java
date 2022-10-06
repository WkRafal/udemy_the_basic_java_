package com.exemple.swing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerMouseMotionListenerExample extends JFrame
        implements MouseListener {
    public static void main(String[] args) {

        MouseListenerMouseMotionListenerExample frame =
                new MouseListenerMouseMotionListenerExample();

        frame.addMouseListener(frame);

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("mouseDragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               // System.out.println("mouseMoved" + "x: " + e.getX() + "y: " + e.getY());
            }
        });

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
        System.out.println("Click count: " + e.getClickCount());
        System.out.println("window x: " + e.getXOnScreen());
        System.out.println("screen y: " + e.getYOnScreen());

        String str = "button clicked: ";
        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                str += "button1";
                break;
                case MouseEvent.BUTTON2:
                    str += "button2";
                    break;
                    case MouseEvent.BUTTON3:
                        str += "button3";
                        break;
        }

        System.out.println(str);


    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }


}
