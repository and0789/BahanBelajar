package org.itc.exercise07;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {3, 5, 2, 4, 5, 9, 4};
        int key = 4;

        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                System.out.println("List["+i+"] = " + list[i] + " key = " + key + " Data ditemukan");
                continue;
            }
            System.out.println("List["+i+"] = " + list[i] + " key = " + key);
        }
    }
}

