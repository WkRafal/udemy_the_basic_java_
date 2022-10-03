package com.exemple.streams;

import java.util.stream.Stream;

public class IterateCreateStreams {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1)
                .limit(4)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n < 5, n -> n + 1)
                .forEach(System.out::println);
    }
}
