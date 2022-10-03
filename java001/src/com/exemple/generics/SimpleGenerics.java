package com.exemple.generics;

class Point<T> {
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Trio<T,U,V> {
    private T first;
    private V second;
    private U third;

    public Trio(T first, V second, U third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public U getThird() {
        return third;
    }

    public void setThird(U third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Trio{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

public class SimpleGenerics {
    public static void main(String[] args) {
        Point<Integer> pointInt = new Point<>(12, 30);
        System.out.println(pointInt.toString());

        Point<String> pointStr = new Point<>("X", "Y");
        System.out.println(pointStr.toString());

        Trio<String,Integer,String> trio = new Trio<>("Adam","Kasia",10);
        System.out.println(trio);
    }
}
