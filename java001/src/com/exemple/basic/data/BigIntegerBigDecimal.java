package com.exemple.basic.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("1234567898464123");
        bigInt = bigInt.add(new BigInteger("7894562133132"));
        System.out.println(bigInt.toString());
        System.out.println("wynik:" + bigInt);

        BigDecimal bigDec = new BigDecimal("132546456.6484513");
        bigDec = bigDec.pow(3);
        System.out.println(bigDec);
        bigDec = bigDec.subtract(new BigDecimal("5465462.645465"));
        System.out.println(bigDec);
    }
}
