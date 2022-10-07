package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketExample {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(300);
        Socket socket = serverSocket.accept();
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        writer.println("HTTP/1.1 200 OK");
        writer.println("Content-Type: text/html: charset=utf-8");
        writer.println("connection: Keep-Alive");
        writer.println();

        System.out.println("write text:");
        Scanner scanner = new Scanner(System.in);

        String str = null;
        while (!(str = scanner.nextLine()).equals("exit")) {
            writer.println(str);
        }

        scanner.close();
        socket.close();

    }
}
