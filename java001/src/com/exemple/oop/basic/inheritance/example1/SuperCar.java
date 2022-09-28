package com.exemple.oop.basic.inheritance.example1;

public class SuperCar extends Car{
    SuperCar() {
        type = "SuperCar";
        topSpeed = 300;
    }

    public void setSportMode() {
        System.out.println("sport mode activated");
    }
}
