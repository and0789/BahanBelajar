package org.itc.exercise02;

import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data sub total
        System.out.println("Masukan Subtotal : ");
        double subTotal = input.nextDouble();
        //Input data gratuity rate
        System.out.println("Masukan gratuity : ");
        double gratuityRate = input.nextDouble();

        // hitung nilai gratuitynya
        double gratuity = subTotal * gratuityRate / 100;

        // hitung total
        double total = subTotal + gratuity;

        // menampilkan hasil program
        System.out.println("The gratuity is " + gratuity +
                " and total is " + total);

    }
}
