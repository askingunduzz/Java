package Donguler;

import java.util.Scanner;

public class EKOK_EBOB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ebob = 1;
        int ekok = 1;
        System.out.print("Birinci sayiyi giriniz: ");
        int n1 = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        int n2 = scan.nextInt();
        int i = 1, k = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                //   System.out.print(i+" ");
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB:" + ebob);
        /* baska bir yontem ebob icin:
        for(int i=1;i<=n1;i++){
            if(n1%i==0&&n2%i==0){
             //   System.out.print(i+" ");
                ebob=i;
            }
        }
        */

        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("EKOK: " + ekok);
/* baska bir yontem ekok icin:
        for(k=1;k<=(n1*n2);k++){
            if(k%n1==0&&k%n2==0){
                ekok=k;
                break;
            }
        }

     //   ekok=(n1*n2)/ebob;

 */
    }
}
