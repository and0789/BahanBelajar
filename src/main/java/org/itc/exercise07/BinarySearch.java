package org.itc.exercise07;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = {4, 6, 3, 2, 4, 7, 8, 3, 1, 9, 10};
        int key = 9;

        int low = 0;
        int high = list.length - 1;
        System.out.println(high);

        while (high >= low) {
            int mid = (low + high) / 2;
            System.out.println("Mid = " + mid);
            if (key < list[mid]) {
                high = mid - 1;
                System.out.println("list[" + mid + "] = " + list[mid] + " vs key = " + key + " not found");

            } else if (key == list[mid]) {
                System.out.println("list[" + mid + "] = " + list[mid] + " vs key = " + key + " found");
                break;

            } else {
                low = mid + 1;
                System.out.println("low : " + low);
                System.out.println("list[" + mid + "] = " + list[mid] + " vs key = " + key + " not found");
            }
            System.out.println("data not found");
        }

    }

}
