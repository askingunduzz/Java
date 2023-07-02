package Temel_Kavramlar;
import java.util.Scanner;

public class Daire_Alan_Cevre {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Yaricapi giriniz: ");
        int r=scan.nextInt();
        double pi=3.14;

        System.out.print("Merkez acisini giriniz: ");
        int a=scan.nextInt();

        double cevre = 2*pi*r;
        double alan=pi*r*r;
        double dilim_alan=(pi*r*r*a)/360.0;

        System.out.println("Dairenin alani: "+ alan);
        System.out.println("Dairenin cevresi: "+cevre);
        System.out.println("Daire diliminin aileni: "+dilim_alan);


    }
}
