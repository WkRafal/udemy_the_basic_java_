package com.exemple.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class PriorityQueueStringLengthComparator {
    public static void main(String[] args) {

        PriorityQueue<String> test = new PriorityQueue<>(new StringLengthComparator());
        test.add("Adam");
        test.add("Kasia");
        test.add("Zuzanna");
        test.add("Rafal");
        test.add("Ola");

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
