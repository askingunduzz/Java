package Donguler;
import java.util.Scanner;
public class Mukemmel_Sayi {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n=scan.nextInt();
        int i=1;
        int toplam=0;
        while(i<n){
            if(n%i==0){
                System.out.print(i+" ");
                toplam+=i;
            }
            i++;
        }
        System.out.print("toplam: "+toplam+"\n");
        if(toplam==n){
            System.out.println(n+" Mukemmel sayidir!");
        }
        else{
            System.out.println(n+" Mukemmel sayi degildir.");
        }
    }
}
