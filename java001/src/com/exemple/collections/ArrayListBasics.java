package com.exemple.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList basiList = new ArrayList();
        basiList.add("test");
        basiList.add("info");

        String strEl = (String) basiList.get(0);
        System.out.println(strEl);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kasia");
        arrStr.add("Adam");
        arrStr.add("Anna");
        arrStr.remove(1);
        arrStr.add("Olek");

        for (String s : arrStr) {
            System.out.println(s);
        }
        System.out.println("----------------");

        arrStr.add(0,"Zuza");

        for (String s : arrStr) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        arrStr.set(1,"Katarzyna");

        for (String s : arrStr) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        Collections.sort(arrStr);

        for (String s : arrStr) {
            System.out.println(s);
        }
        System.out.println("------------------");

        arrStr.remove(0);

        for (String s : arrStr) {
            System.out.println(s);
        }
    }
}
