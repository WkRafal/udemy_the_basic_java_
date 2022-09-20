package com.exemple.basic.control_flow_steintments;

public class InfinityLoop {
    public static void main(String[] args) {

        while (true) {
            int random = (int) Math.round(10 * Math.random());
            System.out.println(random);

            if (random == 10) {
                System.out.println("exit while");
                break;
            }
        }

        for ( ; ; ) {
            int random = (int) Math.round(10 * Math.random());
            System.out.println(random);

            if (random == 10) {
                System.out.println("exit for");
                break;
            }
        }
    }
}
