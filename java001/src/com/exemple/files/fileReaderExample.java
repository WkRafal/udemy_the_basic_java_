package com.exemple.files;

import java.io.FileReader;
import java.io.IOException;

public class fileReaderExample {
    public static void main(String[] args) throws IOException {

        FileReader fr = null;

        try {
            int num = 0;
            fr = new FileReader("files\\test2.txt");
            while ((num = fr.read()) != -1) {
                System.out.print((char) num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) fr.close();
        }
    }
}
