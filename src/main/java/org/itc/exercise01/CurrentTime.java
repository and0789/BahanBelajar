package org.itc.exercise01;

public class CurrentTime {
    public static void main(String[] args) {
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

        double jamSekarangDiJakarta = currentHour + 7;



        // Menampilkan Jam Sekarangs
        System.out.println("Jam GMT adalah \n" +
                (int)currentHour + ":" +
                (int)currentMinute + ":" +
                (int)currentSecond);

        System.out.println("Jam Jakarta adalah \n" +
                (int)jamSekarangDiJakarta + ":" +
                (int)currentMinute + ":" +
                (int)currentSecond);



    }
}
