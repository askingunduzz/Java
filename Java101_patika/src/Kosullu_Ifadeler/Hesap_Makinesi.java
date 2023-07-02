package Kosullu_Ifadeler;

import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number1,number2,islem;

        System.out.print("Ilk sayiyi giriniz: ");
        number1=scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        number2=scan.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Hangi islemi yapmak istediginizi belirtiniz: ");
        islem=scan.nextInt();

        switch(islem){
            case 1:
                System.out.println("Toplam: "+ (number1+number2));
                break;
            case 2:
                System.out.println("Cikarma: "+(number1-number2));
                break;
            case 3:
                System.out.println("Carpma: "+(number1*number2));
                break;
            case 4:
                switch(number2){
                    case 0:
                        System.out.println("Payda 0 olamaz! /ERROR/");
                        break;
                    default:
                        System.out.println("Bolme: "+(number1/number2));
                        break;
                }
                break;
                default:
                System.out.println("Yanlis bir secim yaptiniz.");
        }
    }
}
