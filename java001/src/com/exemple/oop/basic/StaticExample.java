package com.exemple.oop.basic;

class PlaneWithStatic {
    static int nextId = 1;

    int id;
    int x, y;

    static int getNextId() {
        return nextId;
    }

    PlaneWithStatic() {
        id = getNextId();
        nextId++;
    }
}

public class StaticExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {

        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();
// tak sie nie robi
        plane2.nextId = 7;

        System.out.println(plane1.nextId);
        System.out.println(plane2.nextId);
        System.out.println(plane3.nextId);

        // ale pokazuje ze static ustawia jedna zmienna

        System.out.println(plane1.id);
        System.out.println(plane2.id);
        System.out.println(plane3.id);

        System.out.println(StaticExample.add(10,12));

        StaticExample example = new StaticExample();
        System.out.println(example.substract(10 ,12));
    }
}
