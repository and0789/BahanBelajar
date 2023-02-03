package org.itc.exercise02;

import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Minute ");
        int minute = input.nextInt();

        final int MINUTE_IN_HOUR = 60;
        final int HOUR_IN_DAY = 24;
        final int DAY_IN_YEAR = 365;

        int year = minute / MINUTE_IN_HOUR / HOUR_IN_DAY / DAY_IN_YEAR;

        int days = minute / MINUTE_IN_HOUR / HOUR_IN_DAY % DAY_IN_YEAR;

        System.out.println(minute + " Minute is " + year + " year and " + days + " days");
    }
}
