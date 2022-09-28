package com.exemple.oop.basic;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car() {}

    public Car(String manufacturer, String name, int year, String color, float topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public void printInfo() {
        System.out.println(this.manufacturer + " "
                + this.name + " "
                + this.year);
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200f;
        ford.printInfo();

        Car chewrolet = new Car();
        chewrolet.manufacturer = "Chewrolet";
        chewrolet.name = "Camaro";
        chewrolet.color = "red";
        chewrolet.year = 2007;
        chewrolet.topSpeed = 220f;
        chewrolet.printInfo();

        Car dogde = new Car("Dogde", "Viper", 1998, "red", 230f);
        dogde.printInfo();
    }
}
