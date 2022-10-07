package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class HTTPURLConnectionExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://imdb.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        System.out.println("Expired date: " + connection.getExpiration());

        System.out.println("last modyfied: " + connection.getLastModified());

        System.out.println("doc date: " + new Date(connection.getDate()));

        System.out.println("content-type: " + connection.getContentType());
        System.out.println("content length: " + connection.getContentLength());
        System.out.println("response code: " + connection.getResponseCode());
    }
}
