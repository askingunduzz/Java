package Diziler;

import java.util.Scanner;

public class Array_Ortalama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Kac sayi gireceksiniz: ");
        int k = keyboard.nextInt();
        System.out.println("Ortalamasini almak istediginiz sayilari giriniz:");
        double[] sayi = new double[k];
        double[] harmo = new double[k];
        double sum = 0.0;
        double harmosum = 0.0;
        for (int i = 0; i < k; i++) {
            sayi[i] = keyboard.nextInt();
            harmo[i] = 1 / (sayi[i]);
            sum += sayi[i];
            harmosum += harmo[i];
        }
        double ort = sum / k;
        System.out.print("Ortalama: " + ort);
        System.out.println();

        System.out.print("Harmonik Ortalama: " + harmosum);
    }
}
