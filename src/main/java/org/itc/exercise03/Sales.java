package org.itc.exercise03;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama Sales");
        String nama = input.nextLine();
        System.out.println("Masukan Jumlah Penjualan Sales hari ini : ");
        int totalPenjualan = input.nextInt();

        int uangJasa;
        double komisi;

        if (totalPenjualan <= 200_000) {
            uangJasa = 10_000;
            komisi = (0.1 * totalPenjualan);
        } else if (totalPenjualan <= 500_000) {
            uangJasa = 20_000;
            komisi = (0.15 * totalPenjualan);
        } else {
            uangJasa = 30_000;
            komisi = (0.2 * totalPenjualan);
        }

        int totalPendapatan = (int) (uangJasa + komisi);

        System.out.println();
        System.out.println("=======================================");
        System.out.println();
        System.out.println("Nama Salses " + nama);
        System.out.println("Selamat, total penjualan anda hari ini adalah " + totalPenjualan);
        System.out.println("Anda berhak mendapatkan komisi " + (int) komisi + " dan uang jasa " + uangJasa);
        System.out.println("Total pendapatan anda hari ini adalah " + totalPendapatan);

    }
}
