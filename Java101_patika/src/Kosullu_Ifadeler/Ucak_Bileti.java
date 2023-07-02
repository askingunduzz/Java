package Kosullu_Ifadeler;

import java.util.Scanner;

public class Ucak_Bileti {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz : ");
        int km = keyboard.nextInt();

        System.out.print("Yasinizi giriniz : ");
        int yas = keyboard.nextInt();
        double yas_indirim_orani;
        if (yas < 12) {
            yas_indirim_orani = 0.5;
        } else if (yas >= 12 && yas <= 24) {
            yas_indirim_orani = 0.1;
        } else if (yas >= 65) {
            yas_indirim_orani = 0.3;
        } else {
            yas_indirim_orani = 0;
        }
        double yolculuk_indirim;
        System.out.print("Yolculuk tipini giriniz (1=> Tek Yon, 2=> Gidis Donus ): ");
        int yolcu_tipi = keyboard.nextInt();
        if (yolcu_tipi == 2) {
            yolculuk_indirim = 0.2;
        } else {
            yolculuk_indirim = 0;
        }

        if (yolcu_tipi == 1 || yolcu_tipi == 2) {
            double normal_tutar = km * 0.10;
            double yas_indirimi = normal_tutar * (yas_indirim_orani);
            double indirimli_tutar = normal_tutar - yas_indirimi;
            double gidis_donus_bilet_indirimi = indirimli_tutar * yolculuk_indirim;
            double toplam_tutar = (indirimli_tutar - gidis_donus_bilet_indirimi) * yolcu_tipi;
            System.out.print("Toplam Tutar = " + toplam_tutar + " TL ");
        } else {
            System.out.println("Hatali Veri Girdiniz!");
        }
    }
}
