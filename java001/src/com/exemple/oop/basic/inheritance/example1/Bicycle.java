package com.exemple.oop.basic.inheritance.example1;

public class Bicycle extends Vehicle{
    Bicycle() {
        //super(); - dodane automatycznie gdy nie ma
        type = "bicycle";
        manufacture = "romet";
        topSpeed = 15;
    }
}
