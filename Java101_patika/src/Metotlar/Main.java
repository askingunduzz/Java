package Metotlar;

public class Main {
    static void helloWorld(){
        System.out.println("Hello World!");
    }
    static int run(int x) {
        x = 10;
        return x;
    }
    static int power(int base, int exp) {

        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
        helloWorld();
        System.out.println(power(4,2));
        int x=25;
        System.out.println(run(5));
    }
}
