package org.itc.exercise03;

import java.util.Objects;
import java.util.Scanner;

public class BertatBadanIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Jenis Kelamin anda (L / P) ");
        String jk = input.next();

        System.out.println("Masukan Tinggi Badan Anda dalam cm");
        double tinggi = input.nextDouble();

        System.out.println("Masukan Berat Badan Anda dalam kg");
        double berat = input.nextDouble();

        String jenisKelamin = "";
        double beratIdeal = 0;

        // Rumus Bocha
        if (Objects.equals(jk, "L")) {
            jenisKelamin = "laki-laki";
            beratIdeal = (tinggi - 100) - (0.1 * (tinggi - 100));
        } else if (Objects.equals(jk, "P")) {
            jenisKelamin = "perempuan";
            beratIdeal = (tinggi - 100) - (0.15 * (tinggi - 100));
        } else {
            System.out.println("Mohon maaf masukan Jenis kelamin dengan L / P");
        }

        // Rumus BIM
        double tinggiDalamM = tinggi / 100;
        double bmi = berat / (Math.pow(tinggiDalamM, 2));

        String keterangan;
        if (bmi < 18.5) {
            keterangan = "Kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            keterangan = "Ideal";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            keterangan = "Kelebihan Berat Badan";
        } else {
            keterangan = "Obesitas";
        }
        System.out.println("Jenis kelamin anda adalah " + jenisKelamin +
                ", maka berat badan ideal anda adalah " + beratIdeal + " Kg");

        System.out.println("Nilai BMI tubuh anda adalah " +
                String.format("%.2f", bmi) + ", maka kategori tubuh anda adalah " + keterangan);

    }
}
