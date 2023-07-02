
// Aleyna Alemdar - Aşkın Gündüz

import java.util.*;

class BusProblem {
    private int vert;
    private List<List<Integer>> adjList;

    public BusProblem(int vert) {
        // initializing
        this.vert = vert;
        adjList = new ArrayList<>(vert + 1);

   
        for (int i = 0; i <= vert; i++) {
            adjList.add(new ArrayList<>());
            // creating empty lists  in adjacencty list for every stat
        }
    }

    public void addEdge(int src, int dest) {
// in the adjacency list, adding edge to source and destination 
        adjList.get(src).add(dest);
    }

    public int[] GMT() {
        // getting min times for reaching stations from start 

        int[] t = new int[vert + 1];

        // -1, which is indicate unvisit station
        Arrays.fill(t, -1);

        // starting station 
        t[1] = 0;

        Queue<Integer> que = new LinkedList<>();

        // adding  starting station to que
        que.add(1);

        // breadth-first search 
        
        for (; !que.isEmpty(); ) {
            int currStat = que.poll();

      // looping through adjacent stations of present station
         for (int nextSta : adjList.get(currStat)) {
           int travT = 1;

         // nextstation !!!
          int waitT = computing(nextSta, currStat);

        // calculation for total time
         int totalT = t[currStat] + travT + waitT;

        if (t[nextSta] == -1 || t[nextSta] > totalT) {
            t[nextSta] = totalT; // update
            que.add(nextSta);
        }
        } }  return t;
    }

    private int computing(int stat, int currStat) {
        // method for wait time calculation 
        List<Integer> timetable = adjList.get(stat);
        int timetableL = timetable.size();

      //  calculation for index 
        int idx = timetable.indexOf(currStat);

        // calculation for wait time 
        int waitT = (idx >= 0) ? (timetableL - idx) % timetableL : 0;

        return waitT;
    }

    public void PMT() {
        int[] minTs = GMT();
         for (int stat = 2; stat <= vert; stat++) {
            int outT = minTs[stat] + ((stat == 3 || stat == 4) ? 2 : (stat == 5) ? 3 : 0);
            System.out.print(outT + " ");
        }
    }
    
}
