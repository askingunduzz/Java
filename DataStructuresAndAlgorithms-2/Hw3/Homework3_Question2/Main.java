
// Aleyna Alemdar - Aşkın Gündüz

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner kulak = new Scanner(System.in);
        int duraklar,otobusler;
        
        duraklar= kulak.nextInt();
        otobusler = kulak.nextInt();
        // reading

        BusProblem BP = new BusProblem(duraklar);

        for (int i = 0; i < otobusler; i++) {
            // reading
            int otoduraklar,cStat,fStat;
            otoduraklar= kulak.nextInt();
            cStat = kulak.nextInt();
            fStat = cStat;

        int j = 1;
        while (j < otoduraklar) {
              // loop for adding edges
           int nStat = kulak.nextInt();
           BP.addEdge(cStat, nStat);
           cStat = nStat; 
           // updating current
            j++;
         }

    // for completing circular path we are adding edge between last sta that visit and first station.
            BP.addEdge(cStat, fStat);
        }
          BP.PMT();
    }
}