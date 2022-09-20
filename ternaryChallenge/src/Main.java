public class Main {
    public static void main(String[] args) {

        int num = 5;

        if (num % 2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");

        System.out.println((num % 2 == 0) ? "parzysta" : "nieparzysta");
    }
}
