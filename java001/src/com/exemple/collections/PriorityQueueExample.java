package com.exemple.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>();
        test.add(99);
        test.add(43);
        test.add(14);
        test.add(37);

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
        System.out.println("\n");
        test.add(100);
        test.add(45);
        test.add(74);
        System.out.println(test.peek());
        System.out.println(test.peek());
    }
}
