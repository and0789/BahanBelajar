package org.itc.exercise02;

import java.util.Scanner;

public class PenjumlahanRibuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil = input.nextInt();

        int satuan = bil % 10;
        int conterPuluhan = bil / 10;
        int puluhan = conterPuluhan % 10;
        int conterRatusan = conterPuluhan / 10;
        int ratusan = conterRatusan % 10;
        int ribuan = conterRatusan / 10;

        int jml = satuan + puluhan + ratusan + ribuan;

        System.out.println(jml);



    }
}
