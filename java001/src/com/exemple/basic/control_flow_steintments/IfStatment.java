package com.exemple.basic.control_flow_steintments;

public class IfStatment {
    public static void main(String[] args) {

        int a = 1;
        if (a > 5) {
            System.out.println("a jest większe do 5");
        } else if (a == 2){
            System.out.println(" a jest rowne 2");
        } else if (a == 4){
            System.out.println(" a jest rowne 4");
        } else if (a == 3){
            System.out.println(" a jest rowne 3");
        } else if (a == 6){
            System.out.println(" a jest rowne 6");
        } else {
            System.out.println(" a jest rowna: " + a);
        }

        if (9 < 3)
            System.out.println("tak");
        else
            System.out.println("nie");
    }
}
