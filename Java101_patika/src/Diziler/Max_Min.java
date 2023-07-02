package Diziler;

import java.util.Arrays;

//array sort kullanip sonra girilen sayinin arraydeki yerini ogreinip -+1 ini print
public class Max_Min {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int i = list.length;
        Arrays.sort(list);

        System.out.print("Min deger: " + list[0]);
        System.out.println();
        System.out.print("Max deger: " + list[i - 1]);
        System.out.println();
        int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};
        //array.search ya da find lazim ya da for loop icinde if
        Arrays.sort(list2);


        for (int k = 0; k < list2.length - 1; k++) {
            if (5 > list2[k] && 5 < list2[k + 1]) {
                System.out.print("Girilen sayidan kucuk en buyuk sayi: " + list2[k]);
                System.out.println();
                System.out.print("Girilen sayidan buyuk en kucuk sayi: " + list2[k + 1]);
            }

        }

    }
}
