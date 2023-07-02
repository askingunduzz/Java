package Metotlar;

// f1=1 f2=1 f3=2 f4=3 f5=5 f6=8 ..
public class fibonacci {
    static int fibo(int x) {
        int total = 0, temp = x;
        if (x == 1 || x == 2) {
            return 1;
        }

        total = fibo(x - 1) + fibo(x - 2);
        return total;
    }

    public static void main(String[] args) {
        System.out.print(fibo(5));
    }
}
