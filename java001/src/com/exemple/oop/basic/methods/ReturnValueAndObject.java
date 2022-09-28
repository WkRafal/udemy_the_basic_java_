package com.exemple.oop.basic.methods;

class Circle {
    float radius;

    Circle(float r) {
        this.radius = r;
    }
}

class MathMethods {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public Circle getNewCircle(float radius) {
        Circle circle = new Circle(radius);
        return circle;
    }

}

public class ReturnValueAndObject {
    public static void main(String[] args) {

        MathMethods math = new MathMethods();
        int a = 12;
        int b = 3;
        int result = math.substract(a, b);
        System.out.println(result);

        Circle circle = math.getNewCircle(10);
        System.out.println("radius:" + circle.radius);
    }
}
