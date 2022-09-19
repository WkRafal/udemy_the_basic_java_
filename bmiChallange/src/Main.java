public class Main {
    public static void main(String[] args) {
        double weight = 108;
        float height = 1.82f;

        float bmi = (float) (weight / Math.pow(height,2));

        System.out.println(bmi);

        int bmi2 = (int)bmi;
        System.out.println(bmi2);
    }
}
