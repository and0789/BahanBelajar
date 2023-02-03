package org.itc.exercise02;

import java.util.Scanner;

public class PrismaSegitigaV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input alas segitiga");
        double as = input.nextDouble();
        System.out.println("Input tinggi segitiga");
        double ts = input.nextDouble();
        System.out.println("Input tinggi prisma");
        double tp = input.nextDouble();

        double a = as / 2;
        double b = Math.pow(a, 2);
        double c = Math.pow(ts, 2);
        double d = b + c;
        double e = Math.pow(d, 0.5);

        double ks = 2 * e + as;


        double volume = (0.5 * as * ts) * tp;
        double luasPermukaan = (2 * 0.5 * as * ts) + (ks * tp);

        System.out.println("Volume Prisma adalah " + volume);
        System.out.println("Luas Permukaan Prisma adalah " + luasPermukaan);
    }
}
