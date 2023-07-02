package Temel_Kavramlar;

import java.util.Scanner;
public class KDV {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        double price,kdvOran;

        System.out.print("Bir fiyat yaziniz: ");
        price=keyboard.nextDouble();

        double kdvOran1=0.18;
        double kdvOran2=0.08;

        kdvOran= price>0&&price<1000 ? kdvOran1:kdvOran2 ;

        double kdv_tutari= price*kdvOran;
        double kdv_fiyat=price+kdv_tutari;

        System.out.println("KDV orani: "+ kdvOran);
        System.out.println("KDV' siz Fiyat: "+price);
        System.out.println("KDV' li Fiyat: "+ kdv_fiyat);
        System.out.println("KDV Tutari: "+ (kdv_tutari));



    }
}