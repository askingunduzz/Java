package Metotlar;

public class palindrom {
    static boolean isPalindrom(int x){
        int son,temp=x,reverseNumber=0;
        while(temp!=0){
            son=temp%10;
            reverseNumber=(reverseNumber*10)+son;
            temp/=10;
        }
        if(x==reverseNumber) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(isPalindrom(303));
    }
}
