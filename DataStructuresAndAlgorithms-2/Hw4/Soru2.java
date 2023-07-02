
//Aşkın Gündüz, Aleyna Alemdar

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner kulak = new Scanner(System.in);

        // reading input
        System.out.print("First Array: ");
        String[] ilkArr = kulak.nextLine().split(" ");

        // reading input
        System.out.print("Second Array: ");
        String[] ikinciArr = kulak.nextLine().split(" ");

        // sorting ilkArr based on ikinciArr!
        String[] sorted_Arr = sortIlkArr(ilkArr, ikinciArr);

        // printing
        System.out.println("Sorted Array:");
        for (String string : sorted_Arr) {
            System.out.print(string + " ");
        }

        kulak.close();
    }

    public static String[] sortIlkArr(String[] ilkArr, String[] ikinciArr) {
        // creating new array for storing purposes 
        String[] sorted_Arr = new String[ilkArr.length];

        int i = 0;
        // iterating over ilkArr 
        while (i < ilkArr.length) {
            String current_kelime = ilkArr[i];
            String sOrder = ikinciArr[i];
            
            // sorting current word 
            String sorted_kelime = kelime_sort(current_kelime, sOrder);
            
            // storing sorted word
            sorted_Arr[i] = sorted_kelime;
            i++;
        }

        return sorted_Arr;
    }

    public static String kelime_sort(String kelime, String sOrder) {
        int mesafe;
        
        // calculating distance between words
        mesafe = mesafe_hesap(kelime, sOrder);

        Character[] chs_arr = new Character[kelime.length()];
        int y = 0;
        // converting string to array 
        while (y < kelime.length()) {
            chs_arr[y] = kelime.charAt(y);
            y++;
        }

        switch (mesafe % 2) {
            case 0:
                // sorting array in descending
                Arrays.sort(chs_arr, new Comparator<Character>() {
                    public int compare(Character ch1, Character ch2) {
                        int ix1, ix2;
                        ix1 = sOrder.indexOf(ch1);
                        ix2 = sOrder.indexOf(ch2);
                        
                        // handling characters that not in sorting order
                        if (ix1 == -1) ix1 = Integer.MAX_VALUE;
                        if (ix2 == -1) ix2 = Integer.MAX_VALUE;
                        
                        return Integer.compare(ix1, ix2);
                    }
                });
                break;
            case 1:
                // sorting array ascending 
                Arrays.sort(chs_arr);
                break;
        }

        StringBuilder sorted_kelime = new StringBuilder();
        //building sorted word
        for (char ch : chs_arr) {
            sorted_kelime.append(ch);
        }

        return sorted_kelime.toString();
    }

    public static int mesafe_hesap(String kelime1, String kelime2) {
        int deger1, deger2;
        
        // computing values of 2 words
        deger1 = kelime_degeri_hesap(kelime1);
        deger2 = kelime_degeri_hesap(kelime2);
        
        // calculating distance between the values
        return Math.abs(deger1 - deger2);
    }

    public static int kelime_degeri_hesap(String kelime) {
        int last_harf_deger;
        
        // computing  value of last
        last_harf_deger = kelime.charAt(kelime.length() - 1) - 'A' + 1;
       
        return last_harf_deger;
    }
}
