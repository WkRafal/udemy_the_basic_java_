public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike("Scoot", "Scalle");
        MotorBike motorBike = new MotorBike("Jazz", "Romet");

        bike.printInfo();
        motorBike.printInfo();
    }
}
