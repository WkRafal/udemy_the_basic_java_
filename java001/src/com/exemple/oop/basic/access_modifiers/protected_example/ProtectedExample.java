package com.exemple.oop.basic.access_modifiers.protected_example;

import com.exemple.oop.basic.access_modifiers.protected_example.packege1.Laptop;
import com.exemple.oop.basic.access_modifiers.protected_example.packege2.Computer;

public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //computer.name = "adf";   blad
        computer.setName("amd");
        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());
    }
}
