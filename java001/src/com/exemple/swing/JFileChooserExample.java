package com.exemple.swing;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.net.FileNameMap;

public class JFileChooserExample extends JFrame {
    public static void main(String[] args) {
        JFileChooserExample frame = new JFileChooserExample();

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Files",
                "mp4","jpg","dat");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);

        switch (result) {
            case JFileChooser.APPROVE_OPTION:
                File file = fileChooser.getSelectedFile();
                System.out.println(file.getAbsolutePath());
                break;
            case JFileChooser.CANCEL_OPTION:
                System.out.println("canceled");
                break;
                case JFileChooser.ERROR_OPTION:
                    System.out.println("error");
                    break;

        }
    }
}
