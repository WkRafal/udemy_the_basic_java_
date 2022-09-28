package com.exemple.oop.basic.exeption;

public class ExeptionBasic {
    public static void main(String[] args) {
        try {
            int numArr[] = {0, 1,2,3,4,5};
            int a = numArr[2];
            int result = a / numArr[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException  e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
        }

        System.out.println("problam continus");
    }
}
