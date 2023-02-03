package org.itc.exercise02;

import java.util.Scanner;

public class Exercise2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jumlah air dalam kilogram ");
        double waterInKilogram = input.nextDouble();

        System.out.println("Masukan Temperatur Awal ");
        double initialTemperature = input.nextDouble();

        System.out.println("Masukan Temperatur Akhir");
        double finalTemperature = input.nextDouble();

        double energy = waterInKilogram * (finalTemperature - initialTemperature) * 4148;

        System.out.println("Energi yang dibutuhkan adalah " + energy);
    }
}
