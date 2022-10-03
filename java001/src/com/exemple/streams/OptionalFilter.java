package com.exemple.streams;

import java.util.Optional;

public class OptionalFilter {
    public static void main(String[] args) {

        String tekst = "Kasia";
        //tekst = null;
        Optional<String> opt = Optional.ofNullable(tekst);

        opt.map(str -> str + " moja żona")
                .filter(str -> str.length() > 5)
                .or(() -> Optional.ofNullable("Kawaler"))
                .ifPresent(System.out::println);
    }
}
