package com.exemple.basic.data.types;

public class J07_Var_Type {
    public static void main(String[] args) {
        int number = add(10, "5");
        System.out.println(number);
    }

    public static int add(int a, String b){
        var result = a + Integer.valueOf(b).intValue();
        return result;
    }
}
