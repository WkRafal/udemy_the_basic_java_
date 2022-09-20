package com.exemple.basic.control_flow_steintments;

public class DoWhileLoop {
    public static void main(String[] args) {
         int a = 0;

         do {
             System.out.println(a);
             a++;
         } while (a < 10);

         do {
             System.out.println(a);
             a--;
         } while (a >= 0);
    }
}
