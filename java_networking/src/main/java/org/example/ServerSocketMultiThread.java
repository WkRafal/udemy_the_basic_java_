package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerSocketMultiThread {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(300);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        while (true) {
            final Socket socket = serverSocket.accept();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedWriter writer= new BufferedWriter(
                                new OutputStreamWriter(socket.getOutputStream())
                        );
                        writer.write("hello from server");
                        writer.flush();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            executorService.submit(runnable);
        }
    }
}
