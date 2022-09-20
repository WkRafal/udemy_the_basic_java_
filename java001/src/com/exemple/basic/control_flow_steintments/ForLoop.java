package com.exemple.basic.control_flow_steintments;

public class ForLoop {
    public static void main(String[] args) {

        int arr[] = {1,5,10,15};

        for (int i =0; i < arr.length; i++) {
            int value = arr[i];
            System.out.println(value);
        }

        System.out.println("-----------------");

        for (int i =0; i < arr.length; i+=2) {
            int value = arr[i];
            System.out.println(value);
        }

        System.out.println("-----------------");

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}
