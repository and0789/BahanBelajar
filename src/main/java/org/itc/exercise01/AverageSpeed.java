package org.itc.exercise01;

public class AverageSpeed {
    public static void main(String[] args) {
        System.out.println("Miles / (hour + (minutes / 60) + (seconds / 3600)) * 1.6");
        System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");
        System.out.printf("%.2f", (50 / (2 + (30 / 60.0) + (45 / 3600.0))) * 1.6);
    }
}
