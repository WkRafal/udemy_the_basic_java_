package com.exemple.collections;

import java.util.ArrayList;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ArrayListMethods {
    public static void main(String[] args) {
        Person p1 = new Person("Adam");
        Person p2 = new Person("Kasia");
        Person p3 = new Person("Rafal");
        Person p4 = new Person("Anna");

        ArrayList<Person> people1 = new ArrayList<>();
        people1.add(p1);
        people1.add(p2);
        people1.add(p3);
        people1.add(p4);

        for (Person person : people1) {
            System.out.println(person);
        }

        Person p5 = new Person("Bartek");
        Person p6 = new Person("Marek");

        ArrayList<Person> people2 = new ArrayList<>();

        people2.add(p5);
        people2.add(p6);

        people1.addAll(people2);
        System.out.println("po połaczeniu kolekcji");
        for (Person person : people1) {
            System.out.println(person);
        }

        if (people1.contains(p4)) {
            System.out.println("posiada");
        }

        if (people1.containsAll(people2)) {
            System.out.println("posiada");
        }

        Person p7 = new Person("Daniel");
        people2.add(p7);

        System.out.println((people1.containsAll(people2)) ? "tak" : "nie");

        people2.remove(p7);
        System.out.println((people1.containsAll(people2)) ? "tak" : "nie");

        people1.removeAll(people2);
        System.out.println("\n po usunieciu drugiej kol");
        for (Person person : people1) {
            System.out.println(person);
        }

        Person person[] = new Person[people1.size()];
        person = people1.toArray(person);
        System.out.println(person.length);

        people1.clear();
        if (people1.isEmpty())
            System.out.println("pusta");
    }
}
