package com.exemple.oop.basic.inheritance.final_example;

class Employee {
    String name;
    String surname;
    String jobTitle;
    float salary;
}

class Manager extends Employee {
    String responsibility;
}

class Director extends Employee {
    String department;
}

class VicePresident extends Employee {

}

final class CEO extends VicePresident {
    String companyName;
}

//class somethink extends CEO {
//
//}

public class Test {
    public static void main(String[] args) {

        CEO ceo = new CEO();
    }
}
