import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj imie");
        String name = reader.readLine();
        System.out.println("twoje imie to: " + name);
        System.out.println("Podaj miejsce zamieskania");
        String placeOfResidence = reader.readLine();

        String sentenceLength = name + " mieszka w " + placeOfResidence;
        System.out.println(sentenceLength);
        System.out.println(sentenceLength.length());
    }
}
