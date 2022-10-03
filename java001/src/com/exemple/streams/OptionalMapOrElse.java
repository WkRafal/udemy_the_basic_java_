package com.exemple.streams;

import java.util.Optional;

public class OptionalMapOrElse {
    public static void main(String[] args) {

        Optional<Integer> opt = Optional.ofNullable(Integer.valueOf(20));

        Optional<Integer> opt2 = opt.map(i -> i * 3);
        System.out.println(opt2);

        Integer integer = null;
        opt = Optional.ofNullable(integer);

        opt2 = opt.map(i -> i * 3);
        System.out.println(opt2.orElse(Integer.valueOf(5)));

        Integer int2 = Integer.valueOf(100);
        //int2 = null;
        Optional<Integer> optInt = Optional.ofNullable(int2);

        optInt.map(i -> i * 2)
                .map(i -> i * 3)
                .map(i -> i / 2)
                .ifPresent(System.out::println); // 300
    }
}
