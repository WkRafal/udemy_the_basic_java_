package com.exemple.basic.control_flow_steintments;

public class SwitchInstruction {

    enum CarWariant {SEDAN, KOMBI, SPORT}
    public static void main(String[] args) {

        int num = 10;

        switch (num) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println("koniec:" + num);
        }

        String str = "Ania";

        switch (str) {
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            default:
                System.out.println("koniec");
        }

        CarWariant car = CarWariant.KOMBI;

        switch (car) {
            case SEDAN:
                System.out.println(CarWariant.SEDAN);
                break;
            case KOMBI:
                System.out.println(CarWariant.KOMBI);
                break;
            case SPORT:
                System.out.println(CarWariant.SPORT);
                break;
            default:
                System.out.println(car);
        }
    }
}
