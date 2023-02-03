package org.itc.exercise06;

public class Soal1 {

    private static final double INCH_TO_METER = 0.0254;
    private static final double METER_TO_INCH = 39.3701;

    public static void main(String[] args) {

        // Display Table
        System.out.println(
                """

                        Inch        Meters        |        Meters        Inch
                        -----------------------------------------------------------"""
        );
        for (double i = 1.0; i <= 100; i++) {
            if (i < 10) {
                System.out.printf("%3.1f    ", i);
                System.out.printf("%10.3f    ", inchToMeter(i));
                System.out.print("     |        ");
                System.out.printf("%-14.1f", i);
                System.out.printf("%7.3f\n", meterToInch(i));
            } else if (i < 100) {
                System.out.printf("%3.1f    ", i);
                System.out.printf("%9.3f    ", inchToMeter(i));
                System.out.print("     |        ");
                System.out.printf("%-14.1f", i);
                System.out.printf("%7.3f\n", meterToInch(i));
            } else {
                System.out.printf("%3.1f    ", i);
                System.out.printf("%8.3f    ", inchToMeter(i));
                System.out.print("     |        ");
                System.out.printf("%-14.1f", i);
                System.out.printf("%7.3f\n", meterToInch(i));
            }

        }

    }

    public static double inchToMeter (double inches){
        return inches * INCH_TO_METER;
    }

    public static double meterToInch(double meters) {
        return meters * METER_TO_INCH;
    }

}
