package org.itc.exercise06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal4 {

    static SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
    static SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    static Date date = new Date();
    static String bulan = monthFormat.format(date);
    static String tahun = yearFormat.format(date);

    public static void main(String[] args) {
        System.out.println("Aplikasi Penggajihan Karyawan");

        Scanner input = new Scanner(System.in);


        System.out.print("Nama Karyawan: ");
        String namaKaryawan = input.next();

        System.out.print("Status Pernikahan: ");
        String statusPernikahan = input.next();

        System.out.print("Jumlah anak: ");
        int jumlahAnak = input.nextInt();

        System.out.print("Jarak Rumah ke Kantor (KM): ");
        int jarak = input.nextInt();

        System.out.print("Jumlah hari masuk kerja: ");
        int hariKerja = input.nextInt();

        System.out.print("Tahun Masuk Bekerja: ");
        int tahunMasuk = input.nextInt();

        System.out.print("Gajih Pokok: ");
        int gajihPokok = input.nextInt();

        int tKeluarga = tunjanganKeluarga(gajihPokok, statusPernikahan, jumlahAnak);
        int tTransport = tunjanganTransporttasi(hariKerja, jarak);
        int tKesehatan = tunjanganKesehatan(tahunMasuk);

        int totalGajih = gajihPokok + tKeluarga + tTransport + tKesehatan;


        System.out.println("----------------------------------------------------------------------");
        System.out.println("Slip gaji karyawan bulan " + bulan + " " + tahun);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nama Karyawan         : " + namaKaryawan);
        System.out.println("Status                : " + statusPernikahan);
        System.out.println("Jumlah Anak           : " + jumlahAnak);
        System.out.println("Jarak Rumah ke Kantor : " + jarak);
        System.out.println("Jumlah masuk kerja    : " + hariKerja);
        System.out.println("Tahun masuk           : " + tahunMasuk);
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t|\tGajih Pokok\t|\tT.Keluarga\t|\tT.Transport\t|\tT.Kesehatan\t|\t");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("\t|\t%,d\t|\t%,d\t\t|\t%,d\t\t|\t%,d\t\t|\n", gajihPokok, tKeluarga, tTransport, tKesehatan);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Total gajih bulan " + bulan + " : " + totalGajih);

    }

    private static int tunjanganKeluarga(int gajihPokok, String statusPernikahan, int jumlahAnak) {
        double tunjanganKeluarga = 0;

        statusPernikahan = statusPernikahan.toLowerCase();

        if (statusPernikahan.equals("menikah") && jumlahAnak == 0 ) {
            tunjanganKeluarga = gajihPokok * 0.05;
        } else if (statusPernikahan.equals("menikah") && jumlahAnak <= 3) {
            tunjanganKeluarga = gajihPokok * 0.075;
        } else if (statusPernikahan.equals("menikah")) {
            tunjanganKeluarga = gajihPokok * 0.1;
        } else if (statusPernikahan.equals("duda") & jumlahAnak > 0) {
            tunjanganKeluarga = gajihPokok * 0.05;
        } else if (statusPernikahan.equals("duda") && jumlahAnak == 0) {
            tunjanganKeluarga = gajihPokok * 0.03;
        } else if (statusPernikahan.equals("janda") && jumlahAnak > 0) {
            tunjanganKeluarga = gajihPokok * 0.075;
        } else if (statusPernikahan.equals("janda") && jumlahAnak == 0) {
            tunjanganKeluarga = gajihPokok * 0.05;
        } else {
            System.out.println("error");
        }

        return (int) tunjanganKeluarga;
    }


    private static int tunjanganTransporttasi (int jumlahHari, int jarak) {
        double tunjanganTransportasi;

        if (jarak < 5) {
            tunjanganTransportasi = jumlahHari * 5_000;
        } else if (jarak <= 10) {
            tunjanganTransportasi = jumlahHari * 10_000;
        } else {
            tunjanganTransportasi = jumlahHari * 15_000;
        }

        return (int) tunjanganTransportasi;
    }

    private static int tunjanganKesehatan (int tahunMasuk) {
        int tahunIni = Integer.parseInt(tahun);
        int tunjanganKesehatan = 0;
        int lamaBekerja = tahunIni - tahunMasuk;
        if (lamaBekerja < 2) {
            tunjanganKesehatan = 200_000;
        } else if (lamaBekerja < 5) {
            tunjanganKesehatan = 500_000;
        } else if (lamaBekerja > 5) {
            tunjanganKesehatan = 750_000;
        } else {
            System.out.println("error");
        }
        return tunjanganKesehatan;
    }



}
