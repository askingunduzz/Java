package Donguler;

import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Kura {
    public static void main(String[] args) {
        Scanner nebilyiim = new Scanner(System.in);
      int  kisi = nebilyiim.nextInt();
/*
        //satranc turnuvasi icin kura yazilimi
        // tek sayi girerse ?
        boolean a = false;
        boolean b = true;
        int kisi = 0;
        do {
            b = true;
            a = true;
            kisi = 0;

            System.out.print("Kac kisi gireceksiniz (cift sayi giriniz):");
            //    TimeUnit.SECONDS.sleep(1);
            try {
                kisi = nebilyiim.nextInt();
                //       TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                System.out.println("Sayi giriniz!");
                a = true;
                b = false;


            }
            if (b) {
                if (kisi % 2 != 0) {
                    a = true;
                    System.out.println("Cift sayi giriniz!");
                }
            }
        }
        while (a);
*/
        //cift

        for (int i = 1; i <= kisi; i++) {
            System.out.println(i + ". kisiyi giriniz: ");
            String c = nebilyiim.nextLine();
        }

    }
}
