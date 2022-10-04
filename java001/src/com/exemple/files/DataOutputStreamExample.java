package com.exemple.files;

import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {

        DataOutputStream out = null;

        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("files\\test.dat")));
            out.writeUTF("testowy string");
            out.writeShort(32000);
            out.writeLong(564321234l);
            out.writeDouble(6774543);
            out.writeByte(12);
            out.writeChar('A');

            out.flush();//wymuszenie zapisu z bufora
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}
