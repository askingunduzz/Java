package Temel_Kavramlar;
import java.util.Scanner;
public class Vucut_Kitle {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);

        System.out.print("Lutfen boyunuz (metre cinsinde) giriniz: ");
        double boy=keyboard.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        int kg= keyboard.nextInt();

        double vucut_kitle= kg/(boy*boy);
        System.out.println("Vucut-Kitle Endexiniz: "+ vucut_kitle);
    }
}
