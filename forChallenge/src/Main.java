public class Main {
    public static void main(String[] args) {

        String names[] = {"Ania", "Kasia", "Ola", "Olek", "Daniel"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i]);
        }

        System.out.println("------------");

        for (int i = names.length - 1; i >= 0 ; i--) {
            System.out.println(i + ". " + names[i]);
        }
    }
}
