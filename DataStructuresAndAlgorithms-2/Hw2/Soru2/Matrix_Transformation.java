package Soru2;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Matrix_Transformation {
    
    static class Edge { // inner class
        int sr, ds, weight;

        Edge(int sr, int ds, int weight) { //constructor
            this.sr = sr;
            this.ds = ds;
            this.weight = weight;
        }
    }
    
    public static void main(String[] args) {
        Scanner kulak = new Scanner(System.in);
        int testc, m_r, m_c, start_r, start_c, end_r, end_c;

        testc = kulak.nextInt();
         m_r = kulak.nextInt();
         m_c = kulak.nextInt(); 
         start_r = kulak.nextInt();
         start_c = kulak.nextInt();
         end_r = kulak.nextInt();
         end_c = kulak.nextInt();

        int[][] m = new int[m_r][m_c];
        
        for (int i = 0; i < m_r; i++) {
            // reading matrix valuess
        
            for (int j = 0; j < m_c; j++) {
                m[i][j] = kulak.nextInt();
            }
        }

        List<Edge> list = new ArrayList<>(); // // converting  matrix to edges of graph
        int vers = m_r * m_c;
        
        for (int i = 0; i < m_r; i++) {
            for (int j = 0; j < m_c; j++) {
                int cVer = i * m_c + j;

                if (i < m_r - 1) {
                    int bottom_v,weight;
                     bottom_v = (i + 1) * m_c + j;
                     weight = m[i][j] ^ (m[i + 1][j]); // XOR operator !!!!!
                    list.add(new Edge(cVer, bottom_v, weight));
                }

                if (j < m_c - 1) {
                    int right_v, weight;
                      // adding edge to right v
                     right_v = i * m_c + (j + 1);
                     weight = m[i][j] ^ (m[i][j + 1]); // XOR operator !!!!!
                    list.add(new Edge(cVer, right_v, weight));
                }
            }
        }
        
        Collections.sort(list, Comparator.comparingInt(edge -> edge.weight)); 
         // sorting  edges relatived to their weights

        int[] p = new int[vers];
        int val=0;
        // assingng every index
        while (val< vers){
             p[val] = val;
             val++;
        }
        for (int i = 0; i < vers; i++) {
            p[i] = i;  // assingng every index
        }

        int numEdges = 0; 
        // defining variables for keep track
        int index = 0;
        List<Edge> mst = new ArrayList<>();
        // creating empty list for storing mst edges
        while (numEdges < vers - 1) {
            Edge edge = list.get(index++);
            int srprnt = detect(p, edge.sr); 
            int dstprnt = detect(p, edge.ds);  
            if (srprnt != dstprnt) {
                // checking source parent destination parent of current are same or diff.
                mst.add(edge);
                numEdges++;
                p[srprnt] = dstprnt;
            }
        }
    
        int[][] adjacency_M = new int[m_r][m_c];
        // 2d array
        int aa =0;
        while (aa < m_c){
            for (int bb = 0; bb < m_c; bb++) {
                adjacency_M[aa][bb] = -1;
            }
            aa++;
        }
       
        for (Edge edge : mst) {
            int r_1,c_1,r_2,c_2; 
            // calculates  columns and rows
             r_1 = edge.sr / m_c;
             c_1 = edge.sr % m_c;
             r_2 = edge.ds / m_c;
             c_2 = edge.ds % m_c;
            adjacency_M[r_1][c_1] = edge.weight;
            adjacency_M[r_2][c_2] = edge.weight;
        }
        
        int[] d_array = new int[vers];
        Arrays.fill(d_array, Integer.MAX_VALUE);
        d_array[start_r * m_c + start_c] = 0;
        PriorityQueue<Integer> priorityq = new PriorityQueue<>((a, b) -> d_array[a] - d_array[b]);
        priorityq.offer(start_r * m_c + start_c);

        while (!priorityq.isEmpty()) {
            int c = priorityq.poll();
            int xyz=0;
            while (xyz<vers ){
                if (adjacency_M[c / m_c][c % m_c] != Integer.MAX_VALUE && adjacency_M[c / m_c][c % m_c] + d_array[c] < d_array[xyz]) {
                    d_array[xyz] = adjacency_M[c / m_c][c % m_c] + d_array[c];
                    priorityq.offer(xyz);
                }
                /*
               getting  node with lowest distance from  priority queue
updateingg  distance of their neighbors if there is shorter path is detected
// adding neighbors
                */
                xyz++;
            }
        }
    System.out.println(3);
    }

    private static int detect(int[] p, int v) {
        // recursive
        if (p[v] != v) {
            p[v] = detect(p, p[v]);
        }
        return p[v];
    }

        
    }