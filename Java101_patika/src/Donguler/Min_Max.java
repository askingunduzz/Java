package Donguler;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, max = 1, min = 1;
        System.out.print("Kac tane sayi gireceksiniz: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            a = scan.nextInt();

            if (i == 1) {
                max = a;
                min = a;
            }
            if (min > a) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        System.out.println("max: " + max + " min: " + min);

    }
}
