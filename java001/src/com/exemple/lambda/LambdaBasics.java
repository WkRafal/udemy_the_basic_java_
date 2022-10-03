package com.exemple.lambda;

//interfejs funkcyjny
interface Addition {
    int add(int a, int b);
}

interface MathOperation <T> {
    T operate(T a, T b);
}

public class LambdaBasics {

    public void test(Addition addition) {
        System.out.println(addition.add(100,50));
    }

    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;

        System.out.println(addition.add(11,6));
        System.out.println(addition.add(20,5));

        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.test((a,b) -> a * 2 + b);

        MathOperation<Integer> addition2 = (a,b) -> a + b;
        System.out.println(addition2.operate(10, 6));

        MathOperation<Integer> substraction = (a,b) -> a - b;
        System.out.println(substraction.operate(10,6));
    }
}
