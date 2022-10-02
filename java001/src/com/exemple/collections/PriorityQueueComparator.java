package com.exemple.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class AscendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 == o2)
            return 0;
        if (o1 > o2)
            return 1;
        else
            return -1;

    }
}

public class PriorityQueueComparator {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>(new AscendingComparator());
        test.add(99);
        test.add(43);
        test.add(14);
        test.add(37);

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
