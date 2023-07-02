package Donguler;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Bir sayi giriniz: ");
//        int a = scan.nextInt();

//3basamakli sayilar
        for (int i= 100; i <1000; i++) {
            int us = 0;
            int a = i;
            int b = i;
            int toplam = 0;
            int taban;
            int c = i;
            //video odevi
            do {
                b /= 10;
                us++;
            }

            while (b != 0);
            do {
                taban = a % 10;

                a /= 10;
                toplam += (Math.pow(taban, us));

            }
            while (a != 0);

            if (c == toplam) {
                System.out.println(c);
            }
        }
        System.out.println("Bir sayi giriniz: ");
        int aa = scan.nextInt();
        int bb=aa;
        int topplam=0;
        while(bb!=0){
            topplam+=(bb%10);
            bb/=10;
        }
        System.out.println("toplam:"+topplam);
    }
}

