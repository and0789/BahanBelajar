package org.itc.exercise04;

import java.util.Scanner;

public class KonversiBilangan {
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
        long bilangan = 0;
        long decimal = 0;
        String hexsa = "";
        String bilanganToString = "";
        boolean isBinary = true;

        switch (menu) {

            case 1 -> {
                System.out.println("Anda Melilih Menu Konversi Bilangan Biner ke Bilangan Desimal");
                System.out.print("Masukkan sebuah bilangan Biner: ");
                bilangan = input.nextLong();
                bilanganToString = String.valueOf(bilangan);
                for (int i = 0; i < bilanganToString.length(); i++) {
                    if (bilanganToString.charAt(i) != '0' && bilanganToString.charAt(i) != '1') {
                        isBinary = false;
                        break;
                    } else if (bilanganToString.charAt(i) == '1') {
                        decimal += Math.pow(2, bilanganToString.length() - 1 - i);
                    }
                }
                if (isBinary) {
                    System.out.println("Bilangan biner : " + bilanganToString + " dalam bilangan desimalnya adalah " + decimal);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 2 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Biner Ke Bilangan Oktal");
                System.out.print("Masukkan sebuah bilangan Biner: ");
                bilangan = input.nextLong();
                bilanganToString = String.valueOf(bilangan);
                for (int i = 0; i < bilanganToString.length(); i++) {
                    if (bilanganToString.charAt(i) != '0' && bilanganToString.charAt(i) != '1') {
                        isBinary = false;
                        break;
                    } else if (bilanganToString.charAt(i) == '1') {
                        decimal += Math.pow(2, bilanganToString.length() - 1 - i);
                    }
                }
                if (isBinary) {
                    String octal = "";
                    while (decimal > 0) {
                        long rem = decimal % 8;
                        octal = rem + octal;
                        decimal = decimal / 8;
                    }
                    System.out.println("Bilangan biner : " + bilanganToString + " dalam bilangan oktalnya adalah " + octal);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 3 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Biner Ke Bilangan Heksa");
                System.out.print("Masukkan sebuah bilangan Biner: ");
                bilangan = input.nextLong();
                bilanganToString = String.valueOf(bilangan);
                for (int i = 0; i < bilanganToString.length(); i++) {
                    if (bilanganToString.charAt(i) != '0' && bilanganToString.charAt(i) != '1') {
                        isBinary = false;
                        break;
                    } else if (bilanganToString.charAt(i) == '1') {
                        decimal += Math.pow(2, bilanganToString.length() - 1 - i);
                    }
                }
                if (isBinary) {
                    String hex = "";
                    char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                    while (decimal > 0) {
                        long rem = decimal % 16;
                        hex = hexChars[(int) rem] + hex;
                        decimal = decimal / 16;
                    }
                    System.out.println("Bilangan biner : " + bilanganToString + " dalam bilangan hexsa adalah " + hex);
                } else {
                    System.out.println("Maaf bilangan yang anda masukan bukan bilangan biner");
                }
            }

            case 4 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Desimal Ke Bilangan Biner");
                System.out.print("Masukkan sebuah bilangan Desimal: ");
                bilangan = input.nextInt();
                decimal = bilangan;
                bilanganToString = String.valueOf(bilangan);
                if (bilanganToString.matches("-?\\d+(\\.\\d+)?")) {
                    String binary = "";
                    while (decimal > 0) {
                        long rem = decimal % 2;
                        binary = rem + binary;
                        decimal = decimal / 2;
                    }

                    System.out.println("Bilangan desimal " + bilangan + " dalam bilangan biner nya adalah " + binary);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Desimal");
                }

            }

            case 5 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Desimal Ke Bilangan Oktal");
                System.out.print("Masukkan sebuah bilangan Desimal: ");
                bilangan = input.nextInt();
                decimal = bilangan;
                bilanganToString = String.valueOf(bilangan);
                if (bilanganToString.matches("-?\\d+(\\.\\d+)?")) {
                    String octal = "";
                    while (decimal > 0) {
                        long rem = decimal % 8;
                        octal = rem + octal;
                        decimal = decimal / 8;
                    }

                    System.out.println("Bilangan desimal " + bilangan + " dalam bilangan oktal nya adalah " + octal);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Desimal");
                }
            }

            case 6 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Desimal Ke Bilangan Heksa");
                System.out.print("Masukkan sebuah bilangan Desimal: ");
                bilangan = input.nextInt();
                decimal = bilangan;
                bilanganToString = String.valueOf(bilangan);
                if (bilanganToString.matches("-?\\d+(\\.\\d+)?")) {
                    String heksa = "";
                    while (decimal > 0) {
                        long rem = decimal % 16;
                        heksa = rem + heksa;
                        decimal = decimal / 16;
                    }

                    System.out.println("Bilangan desimal " + bilangan + " dalam bilangan heksa nya adalah " + heksa);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Desimal");
                }
            }


            case 7 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Heksa Ke Bilangan Biner");
                System.out.print("Masukkan sebuah bilangan Heksa: ");
                hexsa = input.next();
                if (hexsa.matches("^[0-9a-fA-F]+$")) {
                    StringBuilder binary = new StringBuilder();
                    for (int i = 0; i < hexsa.length(); i++) {
                        char c = hexsa.charAt(i);
                        switch (c) {
                            case '0' -> binary.append("0000");
                            case '1' -> binary.append("0001");
                            case '2' -> binary.append("0010");
                            case '3' -> binary.append("0011");
                            case '4' -> binary.append("0100");
                            case '5' -> binary.append("0101");
                            case '6' -> binary.append("0110");
                            case '7' -> binary.append("0111");
                            case '8' -> binary.append("1000");
                            case '9' -> binary.append("1001");
                            case 'A' -> binary.append("1010");
                            case 'B' -> binary.append("1011");
                            case 'C' -> binary.append("1100");
                            case 'D' -> binary.append("1101");
                            case 'E' -> binary.append("1110");
                            case 'F' -> binary.append("1111");
                        }
                    }

                    System.out.println("Bilangan Hexsa " + hexsa + " dalam bilangan biner nya adalah " + binary);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Hexsa");
                }
            }


            case 8 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Heksa Ke Bilangan Desimal ");
                System.out.print("Masukkan sebuah bilangan Heksa: ");
                hexsa = input.next();
                if (hexsa.matches("^[0-9a-fA-F]+$")) {
                    decimal = 0;
                    for (int i = 0; i < hexsa.length(); i++) {
                        char c = hexsa.charAt(i);
                        int digit;
                        if (c >= '0' && c <= '9') {
                            digit = c - '0';
                        } else if (c >= 'A' && c <= 'F') {
                            digit = c - 'A' + 10;
                        } else {
                            throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
                        }
                        decimal += digit * Math.pow(16, hexsa.length() - i - 1);
                    }
                    System.out.println("Bilangan Hexsa " + hexsa + " dalam bilangan desimal nya adalah " + decimal);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Desimal");
                }
            }


            case 9 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Heksa Ke Bilangan Oktal ");
                System.out.print("Masukkan sebuah bilangan Heksa: ");
                hexsa = input.next();
                if (hexsa.matches("^[0-9a-fA-F]+$")) {
                    decimal = 0;
                    for (int i = 0; i < hexsa.length(); i++) {
                        char c = hexsa.charAt(i);
                        int digit;
                        if (c >= '0' && c <= '9') {
                            digit = c - '0';
                        } else if (c >= 'A' && c <= 'F') {
                            digit = c - 'A' + 10;
                        } else {
                            throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
                        }
                        decimal += digit * Math.pow(16, hexsa.length() - i - 1);
                    }
                    String octal = "";
                    while (decimal > 0) {
                        octal = (decimal & 7) + octal;
                        decimal = decimal >> 3;
                    }

                    System.out.println("Bilangan Hexsa " + hexsa + " dalam bilangan oktal nya adalah " + octal);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Desimal");
                }
            }

            case 10 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Oktal Ke Bilangan Biner ");
                System.out.print("Masukkan sebuah bilangan Oktal: ");
                bilangan = input.nextLong();
                bilanganToString = String.valueOf(bilangan);

                if (bilanganToString.matches("^[0-7]+$")) {
                    String binary = "";
                    for (int i = 0; i < bilanganToString.length(); i++) {
                        int digit = bilanganToString.charAt(i) - '0';
                        String binPart = "";
                        for (int j = 0; j < 3; j++) {
                            binPart = (digit & 1) + binPart;
                            digit = digit >> 1;
                        }
                        binary += binPart;
                    }
                    System.out.println("Bilangan oktal " + bilangan + " dalam bilangan biner nya adalah " + binary);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Oktal");
                }
            }

            case 11 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Oktal Ke Bilangan Desimal ");
                System.out.print("Masukkan sebuah bilangan Oktal: ");
                bilangan = input.nextLong();
                bilanganToString = String.valueOf(bilangan);

                if (bilanganToString.matches("^[0-7]+$")) {
                    for (int i = 0; i < bilanganToString.length(); i++) {
                        char c = bilanganToString.charAt(i);
                        int digit = c - '0';
                        decimal += digit * Math.pow(8, bilanganToString.length() - i - 1);
                    }
                    System.out.println("Bilangan oktal " + bilangan + " dalam bilangan desimalnya nya adalah " + decimal);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Oktal");
                }
            }

            case 12 -> {
                System.out.println("Anda Memilih Menu Konversi Bilangan Oktal Ke Bilangan Heksa ");
                System.out.print("Masukkan sebuah bilangan Oktal: ");
                bilangan = input.nextLong();
                bilanganToString = String.valueOf(bilangan);

                if (bilanganToString.matches("^[0-7]+$")) {
                    for (int i = 0; i < bilanganToString.length(); i++) {
                        char c = bilanganToString.charAt(i);
                        int digit = c - '0';
                        decimal += digit * Math.pow(8, bilanganToString.length() - i - 1);
                    }
                    String hex = "";
                    char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    while (decimal > 0) {
                        long remainder = decimal % 16;
                        hex = hexChars[(int) remainder] + hex;
                        decimal = decimal / 16;
                    }
                    System.out.println("Bilangan oktal " + bilangan + " dalam bilangan hexsa nya adalah " + hex);
                } else {
                    System.out.println("Maaf Bilangan yang anda masuka bukan merupakan bilangan Oktal");
                }
            }
        }
    }
}
