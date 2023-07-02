package Temel_Kavramlar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Mat notunuz:");
        mat=keyboard.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=keyboard.nextInt();

        System.out.println("Kimya notunuz:");
        kimya=keyboard.nextInt();

        System.out.println("Tarih notunuz:");
        tarih=keyboard.nextInt();

        System.out.println("Muzik notunuz:");
        muzik=keyboard.nextInt();

        System.out.println("Turkce notunuz:");
        turkce=keyboard.nextInt();

        double ortalama;
        ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamaniz: " +ortalama);

        System.out.println(ortalama>60 ? "Sinifi Gecti" : "Sinifta Kaldi");

    }

    public static class KDV_Tutari {
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
}
