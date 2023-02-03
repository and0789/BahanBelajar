package org.itc.exercise02;

import java.util.Scanner;

public class RupiahToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dollar = 15655.50;

        System.out.println("Masukan Jumlah Uang dalam Rupiah ");
        double rupiah = input.nextDouble();

        dollar = rupiah / dollar;

        System.out.println("Rp." + rupiah + " adalah $" + dollar);

    }
}
