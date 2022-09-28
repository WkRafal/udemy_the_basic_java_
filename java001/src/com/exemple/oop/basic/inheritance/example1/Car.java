package com.exemple.oop.basic.inheritance.example1;

public class Car extends Vehicle{
    Car() {
        super();
        this.type = "Car";
        this.manufacture = "Ford";
        this.topSpeed = 200;
    }

    Car(String manufacture, float topSpeed) {
        this();
        this.topSpeed = topSpeed;
        this.manufacture = manufacture;
    }
}
