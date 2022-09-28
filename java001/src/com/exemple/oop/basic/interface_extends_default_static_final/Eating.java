package com.exemple.oop.basic.interface_extends_default_static_final;

public interface Eating {
    void eat();
    default void searchForFood() {
        System.out.println("searching for food");
    }
}
