package com.exemple.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorManipulation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Jola";
        list.add(p1);
        list.addFirst("Kasia");
        list.addLast("Rafal");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("jola"))
                iterator.set("Zuza");
            if (str.equalsIgnoreCase("adam"))
                iterator.add("Robert");
            if (str.equalsIgnoreCase("rafal"))
                iterator.remove();
        }

        Iterator<String> iiter = list.iterator();
        while (iiter.hasNext()) {
            String str = iiter.next();
            System.out.println(str);
        }
    }
}
