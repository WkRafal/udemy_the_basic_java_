package com.exemple.basic.string_class;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Ola ma kota.").append(123);
        builder.append(" kolejny text.");

        builder.insert(0, "Kasia ma psa. ");

        System.out.println(builder.toString());

        builder.replace(0, 5, "Julia");
        System.out.println(builder.toString());

        builder.insert(12, " oraz kota");
        System.out.println(builder.toString());

        int index = builder.indexOf("123");
        builder.delete(index, builder.length());
        System.out.println(builder.toString());
    }
}
