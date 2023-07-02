
//Aşkın Gündüz, Aleyna Alemdar

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Trie tr = new Trie();
        Scanner kulak = new Scanner(System.in);

        int input_sayisi;
        input_sayisi = kulak.nextInt();
        kulak.nextLine();

        // reading and inserting inputs into to trie
        int i = 0;
        while (i < input_sayisi) {
            String kelime;
            kelime = kulak.next();
            tr.ins(kelime);
            i++;
        }
       // asking the user which func
        System.out.println("\nChoose the function you want to use:"); System.out.println("1) Search");
        System.out.println("2) Count Prefix");  System.out.println("3) Find Reverse");

        // reading choice 
        int secim;
        secim = kulak.nextInt();
       switch (secim) {
            case 1: // search
                String search_kelime;
                search_kelime= kulak.next();
                boolean bulundu;
                bulundu= tr.Search(search_kelime);
                System.out.println(bulundu);
                break;
            case 2: // counting the prefix
                tr.countPrefix();
                break;
            case 3:  // for finding reverse
                String suffix;
                suffix= kulak.next();
                tr.reverseFind(suffix);
                break;
            default: //invalid!
                System.out.println("Invalid choice!");
                break;
        }
        kulak.close(); // closing scanner
    }
}
