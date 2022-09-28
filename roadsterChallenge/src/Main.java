public class Main {
    public static void main(String[] args) {

        Roadster roadster1 = new Roadster(220, 8);
        Roadster roadster2 = new Roadster(280, 6, 4.5f, 320);

        System.out.println(roadster1.getTopSpeed());
        System.out.println(roadster2.getTopSpeed(true));
    }
}
