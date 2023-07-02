package Kosullu_Ifadeler;

import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yil Giriniz: ");
        int yil=scan.nextInt();
        int artik_yil;
        if(yil%4==0){
            if(yil%100==0&&yil%400==0){
                System.out.println(yil+" bir artik yildir! ");
            }
            else if(yil%100!=0){
                System.out.println(yil+ " bir artik yildir! ");
            }
            else{
                System.out.println(yil+ " bir artik yil degildir! ");
            }
        }
        else{
            System.out.println(yil+ " bir artik yil degildir! ");
        }
    }
}
