package org.itc.exercise01;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membaca nilai alas dan tinggi
        System.out.println("Masukan alas segitiga : ");
        double alas = input.nextDouble();

        System.out.println("Masukan tinggi segitiga :");
        int tinggi = input.nextInt();

        double luas = 0.5 * alas * tinggi;

        System.out.println(luas);
    }
}
