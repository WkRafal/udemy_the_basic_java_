package com.exemple.oop.basic.interface_basics;

public class Plane implements Vehicle, Flying{
    @Override
    public void move() {
        System.out.println("plane is moving");
    }

    @Override
    public void stop() {
        System.out.println("plane stopped");
    }

    @Override
    public void turn() {
        System.out.println("plane is turning");
    }

    @Override
    public float getTopSpeed() {
        return 890;
    }

    @Override
    public void increaseHeight() {
        System.out.println("plane is increasing");
    }

    @Override
    public void decreaseHeight() {
        System.out.println("plane is decreasing");
    }
}
