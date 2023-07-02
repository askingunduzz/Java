package Kosullu_Ifadeler;

import java.util.Scanner;

public class Cin_Zodyagi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz: ");
        int yil = scan.nextInt();
        int kalan = yil % 12;
        String hayvan;

        switch (kalan) {
            case 0:
                hayvan = "Maymun";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 1:
                hayvan = "Horoz";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 2:
                hayvan = "Kopek";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 3:
                hayvan = "Domuz";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 4:
                hayvan = "Fare";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 5:
                hayvan = "Okuz";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 6:
                hayvan = "Kaplan";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 7:
                hayvan = "Tavsan";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 8:
                hayvan = "Ejderha";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 9:
                hayvan = "Yilan";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 10:
                hayvan = "At";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
            case 11:
                hayvan = "Koyun";
                System.out.println("Cin Zodyagi Burcunuz: " + hayvan);
                break;
        }


    }
}
