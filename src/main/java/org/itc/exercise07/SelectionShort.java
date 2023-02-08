package org.itc.exercise07;

public class SelectionShort {
    public static void main(String[] args) {
        int[] list = { 5, 4, 8, 2, 9, 7, 1, 6, 3 };
        int m = 1;
        System.out.println("List sebelum di urutkan ");
        for (int i = 0; i < list.length -1; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("");
        System.out.println("==================");

        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                System.out.println("putaran dalam ke " + m + " CurrentMin = " + currentMin + " > " + list[j]);

                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
                m++;
            }
            m = 1;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            System.out.println("");
            System.out.println("=========================");
            int putaran = i + 1;
            System.out.println("Kondisi list pada putaran ke " + putaran);
            for (int k = 0; k < list.length; k++){
                System.out.print(" " + list[k]);
            }
            System.out.println(" ");


        }

    }


}
