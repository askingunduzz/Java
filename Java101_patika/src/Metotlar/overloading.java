package Metotlar;

public class overloading {
    static void print() {
        System.out.println("hey");
    }

    static void print(int a) {
        System.out.println("heyo");
        return;
    }
    static int print(int a,int b){
        System.out.println("heyoo");
        return a+b;
    }

    public static void main(String[] args) {
        print();
        print(2,3);
        print(5);

    }
}
