package com.exemple.basic.control_flow_steintments;

public class CodeBlock {
    public static void main(String[] args) {

        int b = 12;
        int num = 100;
        {
            int a = 5;
            double num2 = 12;
            //double num = 12; // powdouje blad
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            //System.out.println("c=" + c); // powoduje blad
        }

        int c = 7;

        int a = 99;

        {
            int value = 9;
            {
                int text = 8;
                {
                    System.out.println(text);
                    System.out.println(value);
                    System.out.println(a);
                }
            }
        }
    }
}
