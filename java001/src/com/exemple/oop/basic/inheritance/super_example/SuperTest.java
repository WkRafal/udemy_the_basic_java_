package com.exemple.oop.basic.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {

        Student student = new Student("ania", "kowalska", 5);
        Teacher teacher = new Teacher("ola", "goc", "Sport");
        Director director = new Director("piotr", "kon", 123);

        System.out.println(teacher.getTeachingSubject());
    }
}
