package Kosullu_Ifadeler;

import java.util.Scanner;

public class Hava_Sicakligi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hava;
        System.out.println("Hava sicakligini giriniz: ");
        hava = keyboard.nextInt();

        if (hava < 5) {
            System.out.println("Kayak");
        } else if (hava >= 5 && hava < 15) {
            System.out.println("Sinema");
        } else if (hava >= 15 && hava < 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yuzme");
        }

    }
}
