package Temel_Kavramlar;

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);

        double km_basi=2.20;
        int min=20;
        int acilis=10;

        System.out.print("Kac km gidildi? ");
        double km=keyboard.nextDouble();

        double ucret= acilis+km*km_basi;
        double kesin_ucret= ucret<min ? min : ucret;
        System.out.println("Ucretiniz: "+ kesin_ucret +" TL");



    }
}
