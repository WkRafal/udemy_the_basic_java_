public class Truck {
    String producer;
    String model;
    int numberOfWheels;
    String color;
    final int topSpeed = 100;
    final double acceleration;

    Truck() {
        producer = "Freightliner";
        model = "9664";
        numberOfWheels = 6;
        acceleration = 60;
    }

    Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo() {
        System.out.println(this.producer +
                " " + this.model +
                " " + this.color);
    }
}
