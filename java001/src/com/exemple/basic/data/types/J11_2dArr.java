package com.exemple.basic.data.types;

public class J11_2dArr {
    public static void main(String[] args) {
        String strArr[][] = {   //{2}{3}
                {"1","2","3"},
                {"4","5","6"}
        };

        System.out.println(strArr[0][1]);
        System.out.println(strArr[1][0]);


        int numArr[][] = new int[3][4];
        numArr[1][2] = 100;

        int numRows = 10;
        int numCols = 15;

        int arr[][] = new int[numRows][numCols];
    }
}
