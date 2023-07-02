package Diziler;

import java.util.Arrays;

public class Frekans_Bul {
    public static void main(String[] args) {

        int[] list = {12, 23, 98, 43, 12, 12, 43, 23, 67, 11, 11, 56, 11, 11, 11, 34};
        int[] count = new int[list.length];
        System.out.println("Dizi: " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            count[i] = 1;
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((j != i) && (list[i] == list[j])) {
                    count[j] = count[i];
                }
            }
        }
        System.out.println("Tekrar eden sayilar");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                System.out.println(list[i] + " sayisi " + count[i] + " kere tekrar edildi");
            }
        }
    }
}




