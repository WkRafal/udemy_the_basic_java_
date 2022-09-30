package com.exemple.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    private String name;
    private String manufacture;
    private int year;

    public Car(String name, String manufacture, int year) {
        this.name = name;
        this.manufacture = manufacture;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("A6","Audi",202));
        cars.add(new Car("Caro","polonez",1992));
        cars.add(new Car("passat","volkswagen",2022));

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car);
        }
        System.out.println("------------------");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("---------------------");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }

    }
}
