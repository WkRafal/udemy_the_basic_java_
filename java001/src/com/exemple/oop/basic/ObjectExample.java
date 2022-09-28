package com.exemple.oop.basic;

class CarObject{
    private String manufacture;
    private String model;
    private int year;

    public CarObject(String manufacture, String model, int year) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        CarObject car = new CarObject("Ford","T",1920);
        CarObject car2 = new CarObject("Dogde","Charger",2020);

        System.out.println(car);
        System.out.println(car.hashCode());

        if (car.equals(car2)) {
            System.out.println("car rowne car2, ta sama referencja");
        } else
            System.out.println("rozne referencje");
    }
}
