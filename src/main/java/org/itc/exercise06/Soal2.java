package org.itc.exercise06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal2 {

    static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aplikasi Penghitung Luas Permukaan dan Voleme Bangun Ruang");
        System.out.println("----------------------------------------------------------");
        System.out.println("----------- PILIH MENU -----------");
        System.out.println("1. Kubus");
        System.out.println("2. Prisma Segi Empat");
        System.out.println("3. Bola");
        System.out.println("4. Kerucut");
        System.out.println("5. Tabung");
        System.out.println("Silahkan masukan no menu : ");
        int menu = input.nextInt();

        double surfaceArea = 0, volume = 0;
        String spaceShapeName = "";

        switch (menu) {
            case 1 -> {
                spaceShapeName = "KUBUS";
                System.out.println("MENU" + spaceShapeName);
                System.out.println("Masukan Panjang Sisi Kubus : ");
                double sideLength = input.nextDouble();
                cube(sideLength); // call void method example
            }
            case 2 -> {
                spaceShapeName = "PRISMA SEGIEMPAT";
                System.out.println("MENU" + spaceShapeName);
                System.out.println("Masukan Panjang Prisma : ");
                double length = input.nextDouble();
                System.out.println("Masukan Lebar Prisma : ");
                double width = input.nextDouble();
                System.out.println("Masukan Panjang Tinggi : ");
                double height = input.nextDouble();
                quadrilateralPrism(length, width, height); // call void method example
            }
            case 3 -> {
                spaceShapeName = "BOLA";
                System.out.println("MENU" + spaceShapeName);
                System.out.println("Masukan jari-jari bola");
                double radius = input.nextDouble();
                surfaceArea = surfaceAreaSphere(radius);
                volume = volumeSphere(radius);
            }
            case 4 -> {
                spaceShapeName = "KERUCUT";
                System.out.println("MENU" + spaceShapeName);
                System.out.println("Masukan jari-jari kerucut");
                double radius = input.nextDouble();
                System.out.println("Masukan tinggi kerucut");
                double height = input.nextDouble();
                surfaceArea = surfaceAreaCone(radius, height);
                volume = volumeCone(radius, height);
            }
            case 5 -> {
                spaceShapeName = "TABUNG";
                System.out.println("MENU" + spaceShapeName);
                System.out.println("Masukan jari-jari Tabung");
                double radius = input.nextDouble();
                System.out.println("Masukan tinggi Tabung");
                double height = input.nextDouble();
                surfaceArea = surfaceAreaCylinder(radius, height);
                volume = volumeCylinder(radius, height);
            }
            default -> System.out.println("Maaf Menu yang anda masukan salah");
        }

        if (menu > 2) {
            System.out.println("Luas Permukaan dari " + spaceShapeName + " adalah " + df.format(surfaceArea));
            System.out.printf("Volume dari " + spaceShapeName + " adalah " + df.format(volume));
        }
    }

    // void method example
    private static void cube (double sideLength) {
        double surfaceArea = 6 * sideLength * sideLength;
        double volume = sideLength * sideLength * sideLength;
        System.out.println("Luas Permukaan dari Kubus adalah " + df.format(surfaceArea));
        System.out.println("Volume dari Kubus adalah " + df.format(volume));
    }

    private static void quadrilateralPrism (double length, double width, double height) {
        double surfaceArea = 2 * (length * width + width * height + height * length);
        double volume = length * width * height;
        System.out.println("Luas Permukaan dari PRISMA SEGIEMPAT adalah " + df.format(surfaceArea));
        System.out.println("Volume dari PRISMA SEGIEMPAT adalah " + df.format(volume));
    }


    // return method example
    private static double surfaceAreaSphere(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    private static double volumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    private static double surfaceAreaCylinder(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    private static double volumeCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    private static double surfaceAreaCone(double radius, double height) {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    private static double volumeCone(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }




}
