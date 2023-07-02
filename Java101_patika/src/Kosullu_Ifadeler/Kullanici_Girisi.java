package Kosullu_Ifadeler;
import java.util.Scanner;
public class Kullanici_Girisi {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);

        String userName,password;

        System.out.print("Kullanici adini giriniz: ");
        userName=keyboard.nextLine();

        System.out.print("Sifrenizi giriniz: ");
        password=keyboard.nextLine();

        if(userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giris yaptiniz! ");
        }
        else if(userName.equals("patika")&& !password.equals("java123")){
            System.out.println("Sifrenizi sifirlamak ister misiniz? (yes/no)");
            String x=keyboard.nextLine();
            if(x.equals("yes")){
                System.out.print("Yeni sifrenizi giriniz: ");
                String newPassword=keyboard.nextLine();
                if(newPassword==password){
                    System.out.print("Sifre olusturulamadı, lutfen baska sifre giriniz.");
                }
                else{
                    System.out.print("Sifre olusturuldu!");
                }
            }
            else{
                System.out.println("Iyi gunler dileriz!");
            }
        }
        else{
            System.out.println("Bilgileriniz yanlis. ");
        }
    }
}
