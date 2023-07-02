package Donguler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanici adiniz: ");
            userName = scan.nextLine();
            System.out.print("Parolaniz: ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                do {
                    System.out.println("1-Para yatirma\n2-Para Cekme\n3-Bakiye sorgulama\n4-Cikis yap");
                    System.out.print("Yapmak istediginiz islemi seciniz: ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatiracaginiz para miktari: ");
                            int price = scan.nextInt();
                            balance += price;
                            System.out.println("Paraniz yatirildi. Bakiyeniz: " + balance);
                            System.out.println("Tekrar gorusmek uzere! ");
                            break;

                        case 2:
                            System.out.print("Cekeceginiz para miktari: ");
                            price = scan.nextInt();


                            if (price > balance) {
                                System.out.print("Bakiye yetersiz. ");

                            } else {
                                balance -= price;
                                System.out.println("Paraniz size verildi. Kalan bakiyeniz: " + balance);
                                System.out.println("Tekrar gorusmek uzere! ");
                                break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            System.out.println("Tekrar gorusmek uzere! ");
                            break;
                        default:
                            System.out.println("Gecersiz islem. Tekrar gorusmek uzere! ");
                            break;
                    }
                    break;
                }
                while (select != 4);
                break;
            } else {
                System.out.print("Hatali kullanici adi veya sifre.");
                right--;
                switch (right) {
                    case 1:
                        System.out.println(" Bir hakkiniz kaldi");
                        break;
                    case 2:
                        System.out.println(" Iki hakkiniz kaldi");
                        break;
                }
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                }
            }
        }
    }
}
