package org.itc.exercise01;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        final double PI = 22.0/7.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jari-jari lingkaran : ");
        double jariJari = input.nextDouble();

        double luasLingkaran = PI * jariJari * jariJari;

        System.out.println("Luas lingkaran dengan jari-jari" +
                jariJari + " adalah " + luasLingkaran);
    }
}
