package com.exemple.oop.basic.access_modifiers.no_modifaier.packege2;

import com.exemple.oop.basic.access_modifiers.no_modifaier.packege1.Product;

public class Computer extends Product {
    public Computer() {
        // name = "computer"; spowoduje blad, brak dostepu z iinnego pakietu przez brak modikfikatora
    }
}
