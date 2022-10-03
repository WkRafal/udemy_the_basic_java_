package com.exemple.streams.optional;

import java.util.Optional;

public class OptionalOrMethod {
    public static void main(String[] args) {

        Integer integer = Integer.valueOf(10);
        Optional<Integer> optInt = Optional.ofNullable(integer);

        Integer result = optInt.filter(i -> i > 0)
                .filter(i -> i < 100)
                .map(i -> i * 2)
                .filter(i -> i > 1000)
                .or(() -> Optional.ofNullable(Integer.valueOf(1200)))
                .orElse(Integer.valueOf(2000));

        System.out.println(result);
    }
}
