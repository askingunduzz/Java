package Donguler;

import java.util.Scanner;

public class Uslu_Sayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban(n): ");
        int n = scan.nextInt();

        System.out.print("Us(r): ");
        int r = scan.nextInt();

        int uslu = 1;
        for (int i = 1; i <= r; i++) {
            uslu *= n;
        }
        System.out.println(uslu);
    }
}
