package com.exemple.oop.basic.access_modifiers.public_example;

import com.exemple.oop.basic.access_modifiers.public_example.package1.BasicClass;
import com.exemple.oop.basic.access_modifiers.public_example.package2.OtherClass;

public class Test {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        basicClass.name = "basic";

        OtherClass otherClass = new OtherClass();
        otherClass.setName("other");
    }
}
