package Donguler;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int n = scan.nextInt();

        double toplam = 0;
        for (double i = 1.0; i <= n; i++) {
            toplam += 1.0 / i;
        }
        System.out.println(toplam);
    }
}
