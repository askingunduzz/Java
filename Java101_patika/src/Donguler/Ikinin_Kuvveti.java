package Donguler;
import java.util.Scanner;
public class Ikinin_Kuvveti {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int a=scan.nextInt();

        for(int i=0;i<=a;i++){
            System.out.print("4^"+i+"=");
            double b=Math.pow(4,i);
            long c=Math.round(b);
            System.out.println(c);
        }
        for(int j=0;j<=a;j++){
            System.out.print("5^"+j+"=");
            double d=Math.pow(5,j);
            long e=Math.round(d);
            System.out.println(e);
        }
    }
}
