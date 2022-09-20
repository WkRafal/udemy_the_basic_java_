package com.exemple.basic.control_flow_steintments;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.println(i);

            if (i > 3) break;
        }

        System.out.println("koniec");

        int a = 10;

        while (a > 0) {
            System.out.println(a);
            a--;

            if (a == 2) break;
        }

        System.out.println("while koniec");


    }
}
