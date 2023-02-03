package org.itc.exercise02;

import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input digit between 0 - 1000");
        int digit = input.nextInt();

        int satuan = digit % 10;
        int conterPuluhan = digit / 10;
        int puluhan = conterPuluhan % 10;
        int ratusan = conterPuluhan / 10;

        int total = satuan + puluhan + ratusan;

        System.out.println("The sum of digit is " + total);

    }
}
