package Kosullu_Ifadeler;
import java.util.Scanner;
public class Sinif_Gecme {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int mat,fizik,kimya,turkce,muzik;

        System.out.print("Matematik notunuz:");
        mat=scan.nextInt();
        System.out.print("Turkce notunuz: ");
        turkce=scan.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya=scan.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik=scan.nextInt();
        System.out.print("Muzik notunuz: ");
        muzik=scan.nextInt();

         //not araligi 0 100 mu
        int i=0,top=0;
        if(mat>=0&&mat<=100){
            i++;
            top+=mat;
        }
        if(turkce>=0&&turkce<=100){
            i++;
            top+=turkce;
        }
        if(kimya>=0&&kimya<=100){
            i++;
            top+=kimya;
        }
        if(muzik>=0&&muzik<=100){
            i++;
            top+=muzik;
        }
        if(fizik>=0&&fizik<=100){
            i++;
            top+=fizik;
        }

        int avg= top/i;

        if(avg<=55){
            System.out.println("Sinifta kaldiniz. :(");
        }
        else{
            System.out.println("Sinifi gectiniz! Tebrikler  :)");
        }
        System.out.print("Ortalamaniz: "+avg);
    }
}
