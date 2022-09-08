package com.exemple.basic.data;

public class EnumExample {

    enum SoundVolume { LOW, MEDIUM, HIGH};
    enum CarVariant {SEDAN, COMBI, SUPERCAR};

    public static void main(String[] args) {
        SoundVolume phoneSound = SoundVolume.LOW;
        System.out.println(phoneSound);
    }
}
