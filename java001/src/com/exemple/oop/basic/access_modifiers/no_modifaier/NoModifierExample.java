package com.exemple.oop.basic.access_modifiers.no_modifaier;

import com.exemple.oop.basic.access_modifiers.no_modifaier.packege1.Laptop;
import com.exemple.oop.basic.access_modifiers.no_modifaier.packege2.Computer;

public class NoModifierExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //computer.name = "adf";   blad
        computer.setName("amd");
        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());
    }
}
