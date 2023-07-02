package Kosullu_Ifadeler;
import java.util.*;
import java.io.*;

class Main {

    public static String SnakeCase(String str) {
        // code goes here
        Scanner s= new Scanner(System.in);
        String str_yes=s.nextLine();
        int a= str_yes.length();
        String str_small=str_yes.toLowerCase();
        String[] str_small_array=str_small.split(" ");
        for(int i=0;i<a;i++){
            System.out.print(str_small_array[i]+"_");
        }

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SnakeCase(s.nextLine()));
    }

}