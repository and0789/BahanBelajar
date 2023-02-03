package org.itc.exercise06;

public class Example {
    public static void main(String[] args) {
        int gajihPokok = 500_000_00;
        int tKeluarga = 1000000;
        int tTransport = 2000000;
        int tKesehatan= 3000000;
        System.out.printf("     %,d     %,d", gajihPokok, gajihPokok);
        System.out.println("Gaji Pokok  |  T. Keluarga  |   T. Transport    |   T.Kesehatan");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |", "Gajih Pokok", "T. Keluarga", "T. Transport", "T. Kesehatan");
        System.out.printf("\n|   %,10d   |   %,11d   |   %,12d   |   %,12d   |", gajihPokok, tKeluarga, tTransport, tKesehatan);


        System.out.println("==============");

        System.out.printf("\t|\tGajih Pokok\t|\tT.Keluarga\t|\tT.Transport\t|\tT.Kesehatan\t|\t");
        System.out.printf("\n\t|\t%,d\t|\t%,d\t|\t%,d\t|\t%,d\t|\t", gajihPokok, tKeluarga, tTransport, tKesehatan);

    }
}
