package org.itc.exercise01;

import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        System.out.println("Program Menghitung Luas Persegi");

        // Membuat Objek untuk Baca Input dari User
        Scanner input = new Scanner(System.in);

        // Algoritma
        // 1. Baca Sisi Persegi
        System.out.println("Masukan sisi persegi");
        int sisi = input.nextInt();

        // 2. Menghitung luas persegi
        int luas = sisi * sisi;

        // 3. Tampilkan hasilnya
        System.out.println("Luas persegi dengan sisi : " + sisi +
                " cm adalah " + luas + " cm2");
    }
}
