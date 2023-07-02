package Donguler;

import java.util.Scanner;

public class Tek_Sayi_Toplam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int total = 0;
        for (int i = 0;; i++) {
            System.out.print("Bir sayi giriniz: ");
            a = scan.nextInt();


            if (a % 2 != 0) {
                break;
            } else {
                total += a;
                continue;

            }
        }
        System.out.println("Toplam: " + total);

    }
}
