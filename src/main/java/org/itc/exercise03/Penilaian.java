package org.itc.exercise03;

import java.util.Scanner;

public class Penilaian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aplikasi Penilaian (Renatang nilai 0 - 100)");
        System.out.print("Masukan Nilai Kehadiran: ");
        int nilaiKehadian = input.nextInt();
        System.out.print("Masukan Nilai Tugas: ");
        int nilaiTugas = input.nextInt();
        System.out.print("Masukan Nilai UTS: ");
        int nilaiUts = input.nextInt();
        System.out.print("masukan Nilai UAS: ");
        int nilaiUas = input.nextInt();
        System.out.print("masukan Nilai Project Akhir: ");
        int nilaiProjectAkhir = input.nextInt();

        double nilaiAkhir = ((0.05 * nilaiKehadian) + (0.2 * nilaiTugas) +
                (0.2 * nilaiUts) + (0.25 * nilaiUas) + (0.30 * nilaiProjectAkhir));

        String indexNilai = "";
        String keterangan = "";

        if (nilaiAkhir >= 90) {
            indexNilai = "A";
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 85) {
            indexNilai = "B+";
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 80) {
            indexNilai = "B";
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 75) {
            indexNilai = "B-";
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 70) {
            indexNilai = "C+";
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 65) {
            indexNilai = "C";
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 60) {
            indexNilai = "C-";
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 50) {
            indexNilai = "D";
            keterangan = "Tidak Lulus";
        } else if (nilaiAkhir < 50) {
            indexNilai = "E";
            keterangan = "Tidak Lulus";
        } else {
            System.out.println("diluar jangkauan");
        }

        if (keterangan.equals("Lulus")) {
            System.out.println();
            System.out.println("Selamat Anda " + keterangan + " dengan nilai " + indexNilai);
        } else {
            System.out.println();
            System.out.println("Nilai anda " + indexNilai + " dinyatakan " + keterangan + "\nAnda harus mengulang matakuliah ini") ;
        }
    }
}
