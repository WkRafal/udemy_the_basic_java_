package com.exemple.oop.basic.inheritance.example1;

public class Vehicle {
    public String type;
    public String manufacture;
    public float topSpeed;

    Vehicle() {
        type = "unknown";
        manufacture = "unknown";
        topSpeed = 0;
    }

    public void printInfo() {
        System.out.println("type: " + this.type +
                " producent: " + this.manufacture +
                " topspeed: " + this.topSpeed);
    }
}
