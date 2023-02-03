package org.itc.exercise04;

import java.util.Scanner;

public class Example {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            String number = input.nextLine();

            if (number.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println(number + " is a decimal number.");
            } else {
                System.out.println(number + " is not a decimal number.");
            }
        }
}
