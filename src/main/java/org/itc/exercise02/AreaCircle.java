package org.itc.exercise02;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        // Create objet fon input from console
        Scanner input = new Scanner(System.in);

        // Buat Konstanta untuk nilai PI
        final double PI = 22.0/7.0;

        // Read Circle radius
        System.out.println("Masukan jari-jari lingkaran");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display the result
        System.out.println("Luas Lingkaran adalah : " + area);

    }
}
