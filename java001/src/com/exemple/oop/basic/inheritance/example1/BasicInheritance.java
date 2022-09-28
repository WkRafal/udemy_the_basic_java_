package com.exemple.oop.basic.inheritance.example1;

public class BasicInheritance {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.printInfo();

        Car car = new Car();
        car.printInfo();

        Car car2 = new Car("Dogde", 230);
        car2.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();

        SuperCar superCar = new SuperCar();
        superCar.printInfo();
        superCar.setSportMode();
    }
}
