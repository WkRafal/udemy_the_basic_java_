package com.exemple.oop.basic.access_modifiers.public_example.package2;

import com.exemple.oop.basic.access_modifiers.public_example.package1.BasicClass;

public class OtherClass extends BasicClass {

    public OtherClass() {
        name = "otherClass";
        this.setName("otherClass");
    }
}
