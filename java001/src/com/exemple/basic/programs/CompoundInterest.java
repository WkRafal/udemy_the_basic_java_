package com.exemple.basic.programs;

import java.util.Scanner;

//procent skladany
//1000 * (1 + 0.05)^3
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital;

        System.out.println("wpisz kapital poczatkowy");
        startCapital = Double.valueOf(scanner.nextLine()).doubleValue();

        System.out.println("wpisz oprocentowanie");
        yearlyInterest = Double.valueOf(scanner.nextLine()).doubleValue();

        System.out.println("wpisz ilos lat oszczedzania");
        numYears = scanner.nextInt();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest / 100.00),numYears);

        System.out.println("zwrot: " + Math.round(finalCapital));

    }
}
