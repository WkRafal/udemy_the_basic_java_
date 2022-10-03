package com.exemple.streams;

import java.util.ArrayList;

public class StreamsBasics {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Asia");
        arr.add("Paweł");
        arr.add("Daniel");
        arr.add("Ola");
        arr.add("Zennon");
        arr.add("Zuzanna");

        arr.stream().filter(el -> el.length() > 3 && el.length() < 7)
                .filter(el -> el.startsWith("P") || el.startsWith("A"))
                .forEach(el -> System.out.println(el));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dogde",250,300000,4));
        cars.add(new Car("Citroen",180,200000,3));
        cars.add(new Car("Opel",220,150000,4));
        cars.add(new Car("Merc",250,400000,5));
        cars.add(new Car("GMC",170,100000,3));
        cars.add(new Car("Porsche",300,800000,5));
        cars.add(new Car("Bmw",240,300000,5));

        cars.stream().filter(car -> car.rating > 3)
                .filter(car -> car.price >= 200000 && car.price < 600000)
                .filter(car -> car.topSpeed > 200)
                .forEach(car -> System.out.println(car));
    }
}
