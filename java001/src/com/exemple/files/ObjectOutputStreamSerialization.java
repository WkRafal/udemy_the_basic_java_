package com.exemple.files;

import java.io.*;

public class ObjectOutputStreamSerialization {
    public static void main(String[] args) throws IOException {

        CarObject car1 = new CarObject("Ford","mustang",2020,230,1);
        CarObject car2 = new CarObject("Audi","A6",2002,240,2);

        ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("files\\cars.dat")));

        out.writeObject(car1);
        out.writeObject(car2);
        out.flush();
        out.close();
    }
}
