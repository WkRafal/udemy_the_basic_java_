public class MotorBike extends Bike{

    MotorBike(String name, String brand) {
        super(brand, name);
        this.setType("MotorBike");
    }

    public void printInfo() {
        System.out.println("MotorBike");
        super.printInfo();
    }
}
