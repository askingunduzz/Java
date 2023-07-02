package Metotlar;
import java.util.Scanner;
public class asal_sayilar {
    static String asal(int x,int trial){
        if(x==2){
            return " asal";
        }
        if(x%trial==0){
           asal(x,trial+1);

            return " asal degil.";
        }
        else{
            return " asal.";
        }



    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int x=scan.nextInt();

        System.out.println(x+asal(x,2));
    }
}
