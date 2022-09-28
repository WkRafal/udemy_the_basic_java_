package com.exemple.oop.basic.inheritance.example2_shop;

public class Computer extends Product{
    Mouse mouse;
    Monitor monitor;
    Keyboard keyboard;

    Computer() {
        mouse = new Mouse();
        monitor = new Monitor();
        keyboard = new Keyboard();

        price = 1000;
    }
}
