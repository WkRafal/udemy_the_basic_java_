package com.exemple.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static void main(String[] args) {


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dogde",250,300000,4));
        cars.add(new Car("Citroen",180,200000,3));
        cars.add(new Car("Opel",220,150000,4));
        cars.add(new Car("Merc",250,400000,5));
        cars.add(new Car("GMC",170,100000,3));
        cars.add(new Car("Porsche",300,800000,5));
        cars.add(new Car("Bmw",240,300000,5));

        List<Car> list = cars.stream()
                .filter(car -> car.price < 500000)
                .limit(3)
                .collect(Collectors.toList());

        list.stream().forEach(System.out::println);
    }
}
