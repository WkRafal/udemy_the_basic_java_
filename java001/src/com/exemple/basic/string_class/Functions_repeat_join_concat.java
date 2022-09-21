package com.exemple.basic.string_class;

public class Functions_repeat_join_concat {
    public static void main(String[] args) {

        String str = "Info";
        str = str.repeat(3);
        System.out.println(str);

        String joinedText = String.join(" - ", "raz", "dwa", "trzy");
        System.out.println(joinedText);

        String text = "Ola ".concat("ma ") + "kota".concat(".");
        System.out.println(text);
    }
}
