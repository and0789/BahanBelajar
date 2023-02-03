package org.itc.exercise02;

import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT");
        int gmtOffset = input.nextInt();

        // Membaca Milidetik
        double totalMillisecond = System.currentTimeMillis();
        System.out.println(totalMillisecond);

        // Menghitung Jumlah detik
        double totalSecond = totalMillisecond / 1000;
        System.out.println(totalSecond);

        // Menghitung detik sekarang
        double currentSecond = totalSecond % 60;
        System.out.println(currentSecond);

        // Menghitung total menit sekarang
        double totalMinute = totalSecond / 60;
        System.out.println(totalMinute);

        // Menghitung menit sekarang
        double currentMinute = totalMinute % 60;
        System.out.println(currentMinute);

        // Menghitung total jam
        double totalHour = totalMinute / 60;
        System.out.println(totalHour);

        // Menghitung jam sekarang
        double currentHour = totalHour % 24;
        System.out.println(currentHour);

        double jamSekarang = currentHour + gmtOffset;



        // Menampilkan Jam Sekarangs
        System.out.println("Jam GMT adalah \n" +
                (int)currentHour + ":" +
                (int)currentMinute + ":" +
                (int)currentSecond);

        System.out.println("Jam di " + gmtOffset + " adalah \n" +
                (int)jamSekarang + ":" +
                (int)currentMinute + ":" +
                (int)currentSecond);



    }
}
