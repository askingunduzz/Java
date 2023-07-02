package Kosullu_Ifadeler;

import java.util.Scanner;

public class Sayi_Siralama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;

        System.out.print("Ilk sayiyi giriniz(a) :");
        a = keyboard.nextInt();
        System.out.print("Ikinci sayiyi giriniz(b) :");
        b = keyboard.nextInt();
        System.out.print("Ucuncu sayiyi giriniz(c) :");
        c = keyboard.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a>b>c");
            } else if (c > b) {
                System.out.println("a>c>b");
            } else {
                System.out.println("a>b=C");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b>a>c");
            } else if (c > a) {
                System.out.println("b>c>a");
            } else {
                System.out.println("b>a=c");
            }
        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("c>a>b");
            } else if (b > a) {
                System.out.println("c>b>a");
            } else {
                System.out.println("c>a=b");
            }
        } else {
            System.out.println("a=b=c");
        }
    }
}
