package com.exemple.oop.basic.inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee employee = new Employee("adam", "kowalski",32);
        employee.printInfo();


        Manager manager = new Manager("piotr","kot",45,"art");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

    }
}
