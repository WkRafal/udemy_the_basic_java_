public class Main {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("obsługa wyjatku nie dziel przez zero");
        }

        try {
            throw new TestExeption();
        } catch (TestExeption e) {
            e.printStackTrace();
        }
    }

}
