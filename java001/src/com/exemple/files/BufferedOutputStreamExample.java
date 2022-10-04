package com.exemple.files;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {

        BufferedOutputStream out = null;
        String str ="testowy string";
        char chars[] = str.toCharArray();

        try {
            out = new BufferedOutputStream(new FileOutputStream("files\\test1.txt"));
            for (char c : chars) {
                out.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}
