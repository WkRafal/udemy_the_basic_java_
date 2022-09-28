public class Car {

    String model;
    String brand;
    String color;

    Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void printInfo() {
        System.out.println(this.model +
                " " + this.brand +
                " " + this.color);
    }
}
