package com.exemple.basic.control_flow_steintments;

public class ForEach {
    public static void main(String[] args) {

        String str[] = {"Ola", "Kasia", "Tomek"};

        for (String s : str) {
            if (s.equalsIgnoreCase("kasia")) continue;
            System.out.println(s);
        }
    }
}
