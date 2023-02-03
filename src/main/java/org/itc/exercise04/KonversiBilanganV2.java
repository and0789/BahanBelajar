package org.itc.exercise04;

import java.util.Scanner;

public class KonversiBilanganV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aplikasi Konversi Sistem Bilangan Bilangan");
        System.out.println(" ==== MENU ====");
        System.out.println("1. Konversi Bilangan Biner ke Bilangan Desimal");
        System.out.println("2. Konversi Bilangan Biner Ke Bilangan Oktal");
        System.out.println("3. Konversi Bilangan Biner ke Bilangan Heksa");
        System.out.println("4. Konversi Bilangan Desimal Ke Biner ");
        System.out.println("5. Konversi Bilangan Desimal Ke Oktal ");
        System.out.println("6. Konversi Bilangam Desimal ke Heksa");
        System.out.println("7. Konversi Bilangan Heksa ke Biner");
        System.out.println("8. Konversi Bilangan Heksa Ke Desimal");
        System.out.println("9. Konversi Bilangan Heksa ke Oktal");
        System.out.println("10. Konversi Bilangan Oktal ke Biner ");
        System.out.println("11. Konversi Bilangan Oktal ke desimal ");
        System.out.println("12. Konversi Bilangan Oktal Ke Heksa");

        System.out.print("Masukkan pilihan menu ");
        int menu = input.nextInt();

        switch (menu) {
            case 1 -> {
                System.out.println("Masukan bilangan biner ");
                int bilangan = input.nextInt();
                String bilanganToString = String.valueOf(bilangan);
                if (bilanganToString.matches("[01]+")) {
                    int decimal = Integer.parseInt(bilanganToString, 2);
                    System.out.println("bilangan biner " + bilangan + "dalam desimal adalah " + decimal);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 2 -> {
                System.out.println("Masukan bilangan biner ");
                int bilangan = input.nextInt();
                String bilanganToString = String.valueOf(bilangan);
                if (bilanganToString.matches("[01]+")) {
                    int decimal = Integer.parseInt(bilanganToString, 2);
                    String octal = Integer.toOctalString(decimal);
                    System.out.println("bilangan biner " + bilangan + "dalam oktal adalah " + octal);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 3 -> {
                System.out.println("Masukan bilangan biner ");
                int bilangan = input.nextInt();
                String bilanganToString = String.valueOf(bilangan);
                if (bilanganToString.matches("[01]+")) {
                    int decimal = Integer.parseInt(bilanganToString, 2);
                    String hex = Integer.toHexString(decimal);
                    System.out.println("bilangan biner " + bilangan + "dalam hexsa adalah " + hex);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 4 -> {
                System.out.println("Masukan bilangan desimal ");
                int bilangan = input.nextInt();
                String bilanganToString = String.valueOf(bilangan);
                String biner = "";
                if (bilanganToString.matches("-?\\d+(\\.\\d+)?")) {

                    biner = Integer.toBinaryString(bilangan);
                    System.out.println("bilangan biner " + bilangan + "dalam hexsa adalah " + biner);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 5 -> {
                System.out.println("Masukan bilangan desimal ");
                int bilangan = input.nextInt();
                String bilanganToString = String.valueOf(bilangan);
                String oktal = "";
                if (bilanganToString.matches("-?\\d+(\\.\\d+)?")) {

                    oktal = Integer.toOctalString(bilangan);
                    System.out.println("bilangan biner " + bilangan + "dalam hexsa adalah " + oktal);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 6 -> {
                System.out.println("Masukan bilangan desimal ");
                int bilangan = input.nextInt();
                String bilanganToString = String.valueOf(bilangan);
                String heksa = "";
                if (bilanganToString.matches("-?\\d+(\\.\\d+)?")) {

                    heksa = Integer.toHexString(bilangan);
                    System.out.println("bilangan biner " + bilangan + "dalam hexsa adalah " + heksa);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }
        }
    }
}
