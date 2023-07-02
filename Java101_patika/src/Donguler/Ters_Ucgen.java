package Donguler;

import java.util.Scanner;

public class Ters_Ucgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayisini yaziniz: ");
        int bas = scan.nextInt();

        for (int i = (bas); i >=1; i--) {
            for (int k = 1; k <= (bas - i+1); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
