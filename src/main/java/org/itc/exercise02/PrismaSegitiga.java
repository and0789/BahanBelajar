package org.itc.exercise02;

import java.util.Scanner;

public class PrismaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input alas segitiga");
        double as = input.nextDouble();
        System.out.println("Input tinggi segitiga");
        double ts = input.nextDouble();
        System.out.println("Input tinggi prisma");
        double tp = input.nextDouble();

        double ks = (2 * (Math.pow((Math.pow((as/2), 2) + (Math.pow(ts, 2))), 0.5 ))) + as;
        double volume = (0.5 * as * ts) * tp;
        double luasPermukaan = (2 * 0.5 * as * ts) + (ks * tp);

        System.out.println("Volume Prisma adalah " + volume);
        System.out.println("Luas Permukaan Prisma adalah " + luasPermukaan);
    }
}
