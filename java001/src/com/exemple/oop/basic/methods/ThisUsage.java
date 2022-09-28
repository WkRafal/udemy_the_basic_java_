package com.exemple.oop.basic.methods;

class  Radio {
    int yearProduction;
    int volume;
    String station;

    Radio() {
        this.yearProduction = 2000;
        volume = 100;
    }

    Radio(int yearProduction) {
        this();
        this.yearProduction = yearProduction;
        this.changeStation("Rock");
    }

    public void changeStation(String newStation) {
        this.station = newStation;
    }

    public Radio getRadio() {
        return this;
    }

    public void printRadioInfo(Radio radio) {
        System.out.println("year:" + radio.yearProduction);
    }
}

public class ThisUsage {
    public static void main(String[] args) {

        Radio radio = new Radio(1996);
        Radio radio1 = new Radio(2010);

        radio1.printRadioInfo(radio.getRadio());
        radio1.printRadioInfo(radio1);
    }
}
