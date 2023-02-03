package org.itc.exercise03;

import java.util.Objects;
import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Apakah pelanggan termasuk member? (Ya/Tidak) ");
        String pelanggan = input.nextLine();

        System.out.println("Masukan Total Belanja: ");
        int totalBelanja = input.nextInt();

        String jenisPelanggan = "";
        String keterangan = "";
        double discount;
        double potonganHarga = 0;

        if (Objects.equals(pelanggan, "Ya")) {
            if (totalBelanja >= 500_000) {
                discount = 0.03;
            } else {
                discount = 0.02;
            }
            jenisPelanggan = "Member";
            potonganHarga = (totalBelanja * discount);
            keterangan = "\nSelamat anda mendapatkan potongan harga " + potonganHarga;
        } else if (Objects.equals(pelanggan, "Tidak")) {
            if (totalBelanja >= 500_000) {
                discount = 0.02;
                potonganHarga = (totalBelanja * discount);
                keterangan = "\nSelamat anda mendapatkan potongan harga " + potonganHarga;
            }
            jenisPelanggan = "Pelanggan Biasa";
        } else {
            System.out.println("Maaf anda salah menginputkan jenis pelanggan");
        }
        double totalBayar = totalBelanja - potonganHarga;

        System.out.println("Anda Merupakan : " + jenisPelanggan);
        System.out.println("Total Belanja anda : " + totalBelanja + keterangan);
        System.out.println("Total bayar : " + totalBayar);

        System.out.println();
        System.out.println("******* CASH SYSTEM *******");

        System.out.println("Total Cash : ");
        int totalCash = input.nextInt();
        if (totalCash >= totalBayar) {
            int kembalian = (int) (totalCash - totalBayar);
            System.out.println("Kembalian anda :" + kembalian);
        } else {
            System.out.println("Maaf jumlah uang yang anda bayarkan kurang");
        }
    }
}
