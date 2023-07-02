// Aleyna Alemdar - Aşkın Gündüz


import java.util.*;

public class ParkingProblem {
    
    private static int deger = Integer.MAX_VALUE;

    public static void main(String[] args) {
        
        Scanner kulak = new Scanner(System.in);
        int N,M,F;
        
         N = kulak.nextInt();  
         // get node number
         M = kulak.nextInt();  
         // get edge number
         F = kulak.nextInt();  
         // parkingg fee!

        int[] amount,amount2;
        amount = new int[N];
        amount2 = new int[N];
        
        int b = 0;
        while (b < N) {
        amount[b] = kulak.nextInt(); 
        // capacity for seating per parking slot
        amount2[b] = amount[b];
        b++;
      }
      
        DiaGraph diagraph = new DiaGraph(N);

        for (int a = 0; a < M; a++) {
            int u,v,w;
            u = kulak.nextInt();
            v = kulak.nextInt();
            w = kulak.nextInt();
            diagraph.addEdge(u - 1, v - 1, w);
            // subtracting 1 for 0-based indexing
        }

        int K;
        K= kulak.nextInt();  
        // get vehicle number
        
        int[] AracFees = new int[K];
        Arrays.fill(AracFees, deger);
        AracFees[0] = F;  
        // fee for entering first slot
        
        PriorityQueue<Node> prioq = new PriorityQueue<>();
        prioq.offer(new Node(0, F));
        //  prioq for storing nodes based on fees

        while (!prioq.isEmpty()) {
             // loop till prioq is empty
            Node nd = prioq.poll();
            // obtaining, eliminating node from prioq with lowest fee.
            int ndID,ndFee;
            ndID = nd.ID;
            ndFee = nd.fee;
            List<int[]> connecting = diagraph.GetConnecting(ndID);
            for (int[] edge : connecting) {
                int connectingID,wgt,yeniFee ;
                connectingID=edge[0];
                wgt = edge[1];
                 // calculating new fee 
                yeniFee = ndFee + wgt;
                
                
                if (yeniFee < AracFees[connectingID] ){
                    if( amount[connectingID] > 0) {
                // looking if is there seating capacity left
                    AracFees[connectingID] = yeniFee;
                    // updating fee for connecting node 
                    prioq.offer(new Node(connectingID, yeniFee));
                      // adding connecting node to prioq with new fee
                }
              }
            }

            // reducing of seating capacity of already visited parking slot
            amount[ndID]--;
            
            if (amount[ndID] > 0) {
                int yeniFee;
                yeniFee= ndFee;
                
                if (yeniFee < AracFees[ndID]) {
                    AracFees[ndID] = yeniFee;
                    //updating
                    prioq.offer(new Node(ndID, yeniFee));
                    // adding current node to priority queue 
                }
            }
        }
            /*
             //Arrays.sort(AracFees);
             for (int i = 0; i < K; i++) {
              if (v[i] == INF) {
                System.out.print("-1 ");
               } else {
                  System.out.print(AracFees[i] + " ");
               }
             }*/
        
            //   System.out.println();
     
            int prntCnt;
            prntCnt= 0;
            int[] sonuc;
            sonuc= new int[K];
      
            int x = 0;
            while (x < N) {
            int fee, amnt;
            fee = AracFees[x];  
            // getting vehicle fee at index x
            amnt = amount2[x]; 
            // same

            int j = 0;
            while (j < amnt) {
              sonuc[prntCnt] = fee;
              prntCnt++;
               j++;
             }
             // assigning fee to available seating slots at the current node
            // repating this for amnt times for filling available slots

            if (prntCnt == K) {
             break;  
            }

           x++;
         }


         for (int i = prntCnt; i < K; i++) {
         sonuc[i] = -1;
         // assigned -1
        }

       int[] sortedSonuc;
       sortedSonuc= Arrays.copyOf(sonuc, sonuc.length);
       Arrays.sort(sortedSonuc, 0, prntCnt);
       
       int y = 0;
       while (y < sonuc.length) {
      if (sonuc[y] == -1) {
        sortedSonuc[y] = -1;
   
      }
          y++;
       }

     for(int i = 0 ; i < K ; i++){
     System.out.print(sortedSonuc[i]+" ");
    // outputting a sorted array with the assigned fees for each parking slot

     }
     
   //System.out.println("Sorted sonuc array with preserved -1: " + Arrays.toString(sortedSonuc));
        
    }
}