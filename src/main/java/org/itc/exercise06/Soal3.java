package org.itc.exercise06;

import java.util.Scanner;

public class Soal3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String in = null, out = null, finalResult = null, number = null;

        // Pilih Menu
        int menu = pilihMenu();

        switch (menu) {
            case 1 -> {
                in = "binary";
                out = "decimal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 2 -> {
                in = "binary";
                out = "octal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 3 -> {
                in = "binary";
                out = "hexadecimal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 4 -> {
                in = "decimal";
                out = "binary";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 5 -> {
                in = "decimal";
                out = "octal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 6 -> {
                in = "decimal";
                out = "hexadecimal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 7 -> {
                in = "hexadecimal";
                out = "binary";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 8 -> {
                in = "hexadecimal";
                out = "octal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 9 -> {
                in = "hexadecimal";
                out = "decimal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 10 -> {
                in = "octal";
                out = "binary";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 11 -> {
                in = "octal";
                out = "decimal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }

            case 12 -> {
                in = "octal";
                out = "hexadecimal";

                // Input binary number
                number = inputNumber(in, out);

                // Check input
                boolean result = checkInput(number, in);

                // Convert number
                finalResult = convertNumber(result, number, in, out);
            }
        }


        assert finalResult != null;
        if (finalResult.equals("Error")) {
            System.out.println("Input yang anda masukan salah");
        } else {
            System.out.println(number.toUpperCase() + " in " + in + " is " + finalResult.toUpperCase() + " in " + out);

        }
    }


    private static int pilihMenu() {
        System.out.println("Converter Number System");
        System.out.println(" ==== MENU ====");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Binary to Octal");
        System.out.println("3. Binary to Hexadecimal");
        System.out.println("4. Decimal to Binary ");
        System.out.println("5. Decimal to Octal ");
        System.out.println("6. Decimal to Hexadecimal");
        System.out.println("7. Hexadecimal to Binary");
        System.out.println("8. Hexadecimal to Octal");
        System.out.println("9. Hexadecimal to Decimal");
        System.out.println("10. Octal to Binary ");
        System.out.println("11. Octal to Decimal ");
        System.out.println("12. Octal to Hexadecimal");

        System.out.print("Chose number of menu : ");
        return input.nextInt();
    }




    // Method input
    private static String inputNumber(String in, String out) {
        String number;
        System.out.println(in + " -> " + out);
        System.out.println("Input " + in + " Number : ");
        number = input.next();
        return number;
    }

    // Method Convert Number
    private static String convertNumber(boolean result, String number, String in, String out) {
        String finalResult;
        if (result) {
            if (in.equals("binary") && out.equals("decimal")) {
                finalResult = String.valueOf(binaryToDecimal(number));
            } else if (in.equals("binary") && out.equals("octal")) {
                finalResult = binaryToOctal(number);
            } else if (in.equals("binary") && out.equals("hexadecimal")) {
                finalResult = binaryToHexadecimal(number);
            } else if (in.equals("decimal") && out.equals("binary")) {
                finalResult = decimalToBinary(number);
            } else if (in.equals("decimal") && out.equals("octal")) {
                finalResult = decimalToOctal(number);
            } else if (in.equals("decimal") && out.equals("hexadecimal")) {
                finalResult = decimalToHexadecimal(number);
            } else if (in.equals("hexadecimal") && out.equals("binary")) {
                finalResult = hexadecimalToBinary(number);
            } else if (in.equals("hexadecimal") && out.equals("octal")) {
                finalResult = hexadecimalToOctal(number);
            } else if (in.equals("hexadecimal") && out.equals("decimal")) {
                finalResult = hexadecimalToDecimal(number);
            } else if (in.equals("octal") && out.equals("binary")) {
                finalResult = octalToBinary(number);
            } else if (in.equals("octal") && out.equals("decimal")) {
                finalResult = octalToDecimal(number);
            } else if (in.equals("octal") && out.equals("hexadecimal")) {
                finalResult = octalToHexadecimal(number);
            } else {
                finalResult = "error";
            }
        } else {
            finalResult = "Error";
        }
        return finalResult;
    }

    // Method for check input
    private static boolean checkInput(String number, String check) {
        switch (check) {
            case "binary" -> {
                return number.matches("[01]+");
            }
            case "decimal" -> {
                return number.matches("-?\\d+(\\.\\d+)?");
            }
            case "hexadecimal" -> {
                return number.matches("^[0-9a-fA-F]+$");
            }
            case "octal" -> {
                return number.matches("^[0-7]+$");
            }
            default -> throw new IllegalStateException("Unexpected value: " + check);
        }
    }


    // method for convert
    private static int binaryToDecimal(String number) {
        return Integer.parseInt(String.valueOf(number), 2);
    }

    private static String binaryToOctal(String number) {
        int decimal = Integer.parseInt(String.valueOf(number), 2);
        return Integer.toOctalString(decimal);
    }

    private static String binaryToHexadecimal(String number) {
        int decimal = Integer.parseInt(String.valueOf(number), 2);
        return Integer.toHexString(decimal);
    }

    private static String decimalToBinary(String number) {
        int decimal = Integer.parseInt(number);
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            long rem = decimal % 2;
            binary.insert(0, rem);
            decimal = decimal / 2;
        }
        return binary.toString();
    }

    private static String decimalToOctal(String number) {
        int decimal = Integer.parseInt(number);
        return Integer.toOctalString(decimal);
    }

    private static String decimalToHexadecimal(String number) {
        int decimal = Integer.parseInt(number);
        return Integer.toHexString(decimal);
    }

    private static String hexadecimalToBinary(String number) {
        number = number.toUpperCase();
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            switch (c) {
                case '0' -> binary.append("0000");
                case '1' -> binary.append("0001");
                case '2' -> binary.append("0010");
                case '3' -> binary.append("0011");
                case '4' -> binary.append("0100");
                case '5' -> binary.append("0101");
                case '6' -> binary.append("0110");
                case '7' -> binary.append("0111");
                case '8' -> binary.append("1000");
                case '9' -> binary.append("1001");
                case 'A' -> binary.append("1010");
                case 'B' -> binary.append("1011");
                case 'C' -> binary.append("1100");
                case 'D' -> binary.append("1101");
                case 'E' -> binary.append("1110");
                case 'F' -> binary.append("1111");
            }
        }
        return String.valueOf(binary);

    }

    private static String hexadecimalToOctal(String number) {
        int decimal = 0;
        number = number.toUpperCase();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
            }
            decimal += digit * Math.pow(16, number.length() - i - 1);
        }
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, (decimal & 7));
            decimal = decimal >> 3;
        }

        return octal.toString();
    }

    private static String hexadecimalToDecimal(String number) {
        number = number.toUpperCase();
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
            }
            decimal += digit * Math.pow(16, number.length() - i - 1);
        }

        return String.valueOf(decimal);

    }

    private static String octalToBinary(String number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            StringBuilder binPart = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                binPart.insert(0, (digit & 1));
                digit = digit >> 1;
            }
            binary.append(binPart);
        }
        return binary.toString();
    }

    private static String octalToDecimal(String number) {
        StringBuilder decimal = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit = c - '0';
            decimal.append(digit * Math.pow(8, number.length() - i - 1));
        }

        return decimal.toString();
    }

    private static String octalToHexadecimal(String number) {
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit = c - '0';
            decimal += digit * Math.pow(8, number.length() - i - 1);
        }
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            long remainder = decimal % 16;
            hex.insert(0, hexChars[(int) remainder]);
            decimal = decimal / 16;
        }

        return hex.toString();
    }
}
