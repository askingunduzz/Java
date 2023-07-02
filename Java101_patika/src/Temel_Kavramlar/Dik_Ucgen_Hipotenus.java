package Temel_Kavramlar;
import java.util.Scanner;
public class Dik_Ucgen_Hipotenus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Kenarin uzunlugu: ");
        int a=scan.nextInt();

        System.out.print("Diger kenarin uzunlugu: ");
        int b=scan.nextInt();

        System.out.print("Hipotenus uzunlugu: ");
        int c=scan.nextInt();

        int cevre= a+b+c;
        int u=cevre/2;
        int alan_karesi=u*(u-a)*(u-b)*(u-c);
        double alan=Math.sqrt(alan_karesi);
        System.out.println("Alan: " +alan);
        //bir diger yontem
        alan=a*b/2;
        System.out.println("Alan: "+alan);

    }
}
