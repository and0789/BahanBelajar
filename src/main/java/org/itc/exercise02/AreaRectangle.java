package org.itc.exercise02;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Banca Nilai Panjang dan Lebar
        System.out.println("Masukan Panjang: ");
        int panjang = input.nextInt();

        System.out.println("Masukan Lebar");
        int lebar = input.nextInt();

        // 2. Hitung Luas Persegi panjang dangan rumus panjang * lebar
        int luas = panjang * lebar;

        // 3. Tampilkan Hasilnya
        System.out.println("Luas Persegi dengan " +
                "Panjang " +panjang +
                " dan Lebar " + lebar +
                " adalah " + luas);
    }
}
