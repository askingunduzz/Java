package Metotlar;

import java.util.Scanner;
//3^4: 3*3*3*3
public class us_hesabi {
    Scanner scan=new Scanner(System.in);
    static int us(int taban, int us) {
        int sonuc=1;
        if(us==0){
            return 1;
        }
        if(taban==0){
            return 0;
        }
    while(us!=0){
        sonuc*=taban;
        us--;
    }
        return sonuc;


    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("taban degeri: ");
        int taban=scan.nextInt();
        System.out.print("us degeri: ");
        int us=scan.nextInt();

        System.out.println("Sonuc: "+us(taban,us));
    }
}
