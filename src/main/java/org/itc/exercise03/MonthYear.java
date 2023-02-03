package org.itc.exercise03;

import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nama Bulan dalam bahasa indonesia : ");
        String bulan = input.nextLine();
        int numBulan = 0;

        switch (bulan) {
            case "Januari" -> numBulan = 1;
            case "Februari" -> numBulan = 2;
            case "Maret" -> numBulan = 3;
            case "April" -> numBulan = 4;
            case "Mei" -> numBulan = 5;
            case "Juni" -> numBulan = 6;
            case "Juli" -> numBulan = 7;
            case "Agustus" -> numBulan = 8;
            case "September" -> numBulan = 9;
            case "Oktober" -> numBulan = 10;
            case "November" -> numBulan = 11;
            case "Desember" -> numBulan = 12;
            default -> System.out.println("Maaf nama bulan yang anda masukan salah");
        }

        System.out.println("Masukan Tahun: ");
        int tahun = input.nextInt();

        int jumlahHari;
        String keterangan;

        boolean b = numBulan == 1 ||
                numBulan == 3 ||
                numBulan == 5 ||
                numBulan == 7 ||
                numBulan == 8 ||
                numBulan == 10 ||
                numBulan == 12;

        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            keterangan = "\nTahun ini merupakan tahun kabisat";
            if (numBulan == 2) {
                jumlahHari = 29;
            } else if (b) {
                jumlahHari = 31;
            } else {
                jumlahHari = 30;
            }
        } else {
            keterangan = "\nTahun ini bukan merupakan tahun kabisat";
            if (numBulan == 2) {
                jumlahHari = 28;
            } else if (b) {
                jumlahHari = 31;
            } else {
                jumlahHari = 30;
            }
        }

        System.out.println("Pada Bulan " + bulan + " Tahun " + tahun + " ada " + jumlahHari + " Hari, " + keterangan);
    }
}
