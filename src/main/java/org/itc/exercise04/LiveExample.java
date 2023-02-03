package org.itc.exercise04;

import java.util.Scanner;

public class LiveExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Menu Aplikasi=====");
        System.out.println("1. Binary to Octal");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Binary to Hexadecimal");
        System.out.println("4. Octal to Binary");
        System.out.println("Please choose menu with number of menu: ");
        int menu = input.nextInt();

        switch (menu) {

            // Covert Binary to Octal
            case 1 -> {
                System.out.println("Binary to Octal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int decimal = 0, i = 0, octal = 0;

                while (binary != 0) {
                    decimal = (int) (decimal + (binary % 10) * Math.pow(2, i));
                    ++i;
                    binary = binary / 10;
                }
                i = 1;
                while (decimal != 0) {
                    octal = octal + (decimal % 8) * i;
                    decimal = decimal / 8;
                    i = i * 10;
                }
                System.out.println("value of " + binary + " in binary is a " + octal + " in octal");

            }

            // Covert Binary to Decimal
            case 2 -> {
                System.out.println("Binary to Decimal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int digit, decimal = 0, i = 1;
                while(binary != 0) {
                    digit = binary % 10;
                    decimal = decimal + (digit * i);
                    i = i * 2;
                    binary = binary / 10;
                }
                System.out.println("value of " + binary + " in binary is a " + decimal + " in decimal");
            }


            // Covert Binary to Hexadecimal
            case 3 -> {
                System.out.println("Binary to Hexadecimal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int binInput = binary;
                int digit, decimal = 0, i = 1;
                while(binary != 0) {
                    digit = binary % 10;
                    decimal = decimal + (digit * i);
                    i = i * 2;
                    binary = binary / 10;
                }
                StringBuilder hex = new StringBuilder();
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                while (decimal > 0) {
                    long rem = decimal % 16;
                    hex.append(hexChars[(int) rem]);
                    decimal = decimal / 16;
                }
                System.out.println("value of " + binInput + " in binary is a " + hex + " in hexadecimal");
            }


            // Covert Octal to Binary
            case 4 -> {
                System.out.println();
            }

            // Covert Octal to Decimal
            case 5 -> {
                System.out.println();
            }

            // Convert Octal to Hexadecimal
            case 6 -> {
                System.out.println();
            }

            default -> {
                System.out.println("Sorry, your choose in wrong ");
            }
        }


    }
}
