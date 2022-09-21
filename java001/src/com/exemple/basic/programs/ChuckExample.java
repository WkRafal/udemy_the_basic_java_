package com.exemple.basic.programs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckExample {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
