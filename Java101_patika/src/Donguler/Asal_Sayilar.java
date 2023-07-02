package Donguler;

public class Asal_Sayilar {
    public static void main(String[] args) {
        int sayac = 0;
        System.out.println("1-100 arasindaki asal sayilar: ");

        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.print(i + " ");
            } else {
                sayac = 0;
            }
        }
    }
}
