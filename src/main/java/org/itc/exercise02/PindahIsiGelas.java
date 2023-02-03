package org.itc.exercise02;

public class PindahIsiGelas {
    public static void main(String[] args) {
        String A = "Susu";
        String B = "Teh";

        System.out.println("Kondisi Belum di Pindahkan");
        System.out.println("Isi Gelas A: " + A);
        System.out.println("Isi Gelas B: " + B);

        // Sediakan Gelas C
        String C;

        C = A;
        A = B;
        B = C;

        System.out.println("----------------------------");
        System.out.println("Kondisi Sudah di Pindahkan");
        System.out.println("Isi Gelas A: " + A);
        System.out.println("Isi Gelas B: " + B);

    }
}
