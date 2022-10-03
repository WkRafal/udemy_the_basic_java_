import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Animal> map = new HashMap<>();

        String names[] = {"Kot","Pies","Koza","Puma"};

        for (int i = 0; i < names.length; i++) {
            map.put(names[i], new Animal(names[i]));
        }
        System.out.println(map.get("Puma"));

        for (Map.Entry<String,Animal> entry : map.entrySet()) {
            String key = entry.getKey();
            Animal value = entry.getValue();
            System.out.println(key + " - " + value.toString());
        }
    }
}
