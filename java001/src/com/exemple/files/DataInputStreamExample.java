package com.exemple.files;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {

        DataInputStream in = null;

        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("files\\test.dat")));
            String str = in.readUTF();
            System.out.println(str);
//            out.writeShort(32000);
            short shortNum = in.readShort();
            System.out.println(shortNum);
//            out.writeLong(564321234l);
            long longNum = in.readLong();
            System.out.println(longNum);
//            out.writeDouble(6774543);
            double doubleNum = in.readDouble();
            System.out.println(doubleNum);
//            out.writeByte(12);
            byte byteNum = in.readByte();
            System.out.println(byteNum);
//            out.writeChar('A');
            char charNum = in.readChar();
            System.out.println(charNum);
//
//            out.flush();//wymuszenie zapisu z bufora
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
    }
}
