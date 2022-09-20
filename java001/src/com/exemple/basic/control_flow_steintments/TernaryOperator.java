package com.exemple.basic.control_flow_steintments;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 1;
        int b = (a > 3 ? 100 : 10);
        System.out.println(b);

        if (a > 3)
            b = 100;
        else
            b = 10;
        System.out.println(b);
    }
}
