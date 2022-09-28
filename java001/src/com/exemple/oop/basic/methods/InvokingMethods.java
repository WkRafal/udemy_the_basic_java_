package com.exemple.oop.basic.methods;

class Triangle {
    float a;
    float h;
    float surfaceArea;

    Triangle(float base, float height) {
        this.a = base;
        this.h = height;
    }
}

class MyMath {

    public void add(int a, int b) {
        a = 20;
        int result = a + b;
        System.out.println("wynik: " + result);
    }
}

public class InvokingMethods {
    public static void main(String[] args) {

        MyMath math = new MyMath();
        int a = 10;
        int b = 5;
        math.add(a, b);
        System.out.println("a:" + a);

        Triangle triangle = new Triangle(10.0f, 5.0f);
    }
}
