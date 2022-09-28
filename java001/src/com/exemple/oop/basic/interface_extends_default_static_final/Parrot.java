package com.exemple.oop.basic.interface_extends_default_static_final;

public class Parrot implements Bird{
    @Override
    public int getNumLegs() {
        return 2;
    }

    @Override
    public String getName() {
        return "Parrot";
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }

    @Override
    public void searchForFood() {
        System.out.println("parrot is searching for food");
    }
}
