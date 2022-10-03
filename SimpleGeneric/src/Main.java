public class Main {
    public static void main(String[] args) {
        Square<Integer> numInt = new Square<>(10);
        System.out.println(numInt.getSurfaceArea());

        Square<Float> numFloat = new Square<>(5.7f);
        System.out.println(numFloat.getSurfaceArea());
    }
}
