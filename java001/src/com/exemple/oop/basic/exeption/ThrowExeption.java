package com.exemple.oop.basic.exeption;

class TestExeption extends Exception {
    public TestExeption() {
        super("TestExeption");
    }

    public TestExeption(String message) {
        super(message);
    }
}

public class ThrowExeption {

    public int divide(int number, int divisor) throws ArithmeticException{
        return number / divisor;
    }

    public int test (int number) throws TestExeption {
        if (1 == 1) throw new TestExeption();
        return 1;
    }

    public static void main(String[] args) {
        try {
            int numArr[] = {0, 1,2,3,4,5};
            int a = numArr[2];
            int divisor = numArr[0];

            if (divisor == 0) throw new ArithmeticException("dzielenie przez zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException  e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
        }

        System.out.println("problam continus");

        ThrowExeption throwExeption = new ThrowExeption();

        try {
            throwExeption.divide(2,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throwExeption.test(12);
        } catch (TestExeption e) {
            e.printStackTrace();
        }
    }
}
