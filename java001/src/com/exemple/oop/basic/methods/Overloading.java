package com.exemple.oop.basic.methods;

class RectangleOverLoading {
    float side1, side2;

    RectangleOverLoading() {
        this(10.0f);//w praktyce wywolujemy 2 konstruktor
    }

    RectangleOverLoading(float v) {
        side1 = side2 = v;
    }

    RectangleOverLoading(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
}

class MayhOverloading {

    public int add(int a, int b, int c) {
        return a + b +c;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {

        MayhOverloading math = new MayhOverloading();

        int a =2;
        int b =6;
        System.out.println(math.add(a, b));

        double d1 = 12;
        double d2 = 12.2;
        System.out.println(math.add(d1, d2));

        int c = 5;
        System.out.println(math.add(a, b, c));

        RectangleOverLoading rect = new RectangleOverLoading();
        System.out.println(rect.side1);

        RectangleOverLoading rect2 = new RectangleOverLoading(15.0f);
        System.out.println(rect2.side1);
    }
}
