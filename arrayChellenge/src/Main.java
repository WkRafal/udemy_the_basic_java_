import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String names[] = {"ania", "ola", "daniel", "karol", "kasia"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("podaj wartosc tablicy od 0 do " + (names.length - 1));
        int numArr =Integer.parseInt(reader.readLine());

        System.out.println("Imie pod indeksem:" + numArr + " to:" + names[numArr]);
    }




}
