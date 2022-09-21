public class Main {
    public static void main(String[] args) {

        String names[] = {"Kasia", "Ola", "Zbyszek", "Pawel"};

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            builder.append(names[i]).append(", ");
        }

        System.out.println(builder.toString());
    }
}
