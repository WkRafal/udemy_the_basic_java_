public class While {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6};

        int i =0;

        while (i < numbers.length) {
            System.out.println(numbers[i] + "*2=" + numbers[i] * 2);
            i++;
        }
    }
}
