package com.exemple.oop.basic.interface_extends_default_static_final;

public interface Flying {
    static final float DEFOULT_WINGSPAN = 0.7f;
    void fly();

    default void flyHigher() {
        System.out.println("higher");
    }

    default float getWingspan() {
        return Flying.DEFOULT_WINGSPAN;
    }

    static int getDefoultNumWings() {
        return 2;
    }
}
