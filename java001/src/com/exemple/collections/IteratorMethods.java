package com.exemple.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Jeep");
        cars.add("Audi");
        cars.add("Merc");

        cars.iterator().forEachRemaining(el -> System.out.println(el));

        Iterator<String> iterator = cars.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("merc"))
                iterator.remove();
        }
        System.out.println(cars);
    }
}
