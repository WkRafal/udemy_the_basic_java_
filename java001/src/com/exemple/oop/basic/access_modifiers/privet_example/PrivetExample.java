package com.exemple.oop.basic.access_modifiers.privet_example;

public class PrivetExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("opel");

        System.out.println(car.getName());
    }
}
