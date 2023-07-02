package Donguler;

import java.util.Scanner;

public class Donguler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int a = scan.nextInt();

        double toplam = 0;
        int bolunen = 0;
        double ort;
        System.out.print("3 ve 4' e bolunen sayilar: ");
        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
                toplam += i;
                bolunen++;
                continue;
            }
        }
        System.out.println();
        ort = toplam / bolunen;
        System.out.println("Bu sayilarin ortalamasi: "+ort);
    }
}
