package Donguler;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac elemanli bir fibonacci serisi istersiniz? ");
        int no = scan.nextInt();
        int top1 = 0, top2 = 1, top;
        for (int i = 1; i <= no + 1; i++) {
            top = top1 + top2;
            System.out.println(top1 + "+" + top2 + "=" + top);
            top1 = top2;
            top2 = top;

        }
    }
}
