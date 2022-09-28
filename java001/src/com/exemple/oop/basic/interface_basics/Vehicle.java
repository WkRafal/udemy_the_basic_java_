package com.exemple.oop.basic.interface_basics;

public interface Vehicle {
    public void move();
    public void stop();
    public abstract void turn(); //wszystkie sa abstrakcyjne
    public float getTopSpeed();
}
