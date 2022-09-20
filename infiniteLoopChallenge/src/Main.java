import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

        while (true) {
            System.out.println("podaj liczbe lub quit");
            String data = reader.readLine();
            if (data.equalsIgnoreCase("quit")) break;

            int num = Integer.parseInt(data);
            number += num;
            System.out.println("Suma wpisanych liczb:" + number);
        }

    }
}
