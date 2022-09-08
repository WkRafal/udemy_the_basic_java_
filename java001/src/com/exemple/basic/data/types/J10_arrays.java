package com.exemple.basic.data.types;

public class J10_arrays {
    public static void main(String[] args) {
        int numArr[] = new int[10];
        numArr[1] = 7;
        System.out.println("drugi el:" + numArr[1]
                + ", length:" + numArr.length);

        float floatArr[] = {10.1f,5.9f,7.4f,-54.0f};
        floatArr[0] = 1.0f;

        System.out.println("2el:" + floatArr[1] + ", length:"
                + floatArr.length);

        String strArr[] = new String[7];
        System.out.println("2 el:" + strArr[1]);

        String nameArr[] = {"ola", "krzys", "adam"};
        System.out.println("2el:" + nameArr[1]);
    }

}
