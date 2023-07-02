package Soru2;

import java.util.*;

public class TourGuide {

private final List<Integer>[] adj; 
private final int Vertex;

private boolean[] marked; 
// array to record visited vertex locations

private List<List<Integer>> tours;


public TourGuide(int Vertex) {
    //const.
    this.Vertex = Vertex;
    adj = new ArrayList[Vertex];
    
    for (int i = 0; i < Vertex; i++) {
        adj[i] = new ArrayList<>();
    }
    
}

// add edge
public void addEdge(int vertex1, int vertex2) {
    //from slides
    adj[vertex1].add(vertex2);
    adj[vertex2].add(vertex1);
}

// geting the tours included in graph
public List<List<Integer>> getTours() {
    marked = new boolean[Vertex];
    tours = new ArrayList<>();
    
    for (int vertex1 = 0; vertex1 < Vertex; vertex1++) {
        depthfirstsearch(vertex1, -1, new ArrayList<>());
    }
    
    return tours;
}

// depth-first search 

private void depthfirstsearch(int vertex1, int goback, List<Integer> road) {
    marked[vertex1] = true;
    road.add(vertex1);
    
    for (int vertex2 : adj[vertex1]) {
        
            List<Integer> tour = new ArrayList<>();
            
            for (int i = road.indexOf(vertex1); i < road.size(); i++) {
                tour.add(road.get(i));
            
            
        if (!marked[vertex2]) {
            // recursive!!
            /*
            caution!!1
            */
            depthfirstsearch(vertex1, vertex2, road); //!!!
            // anlamadım recursive.
            }
            
            // sorting increasing order and adding it to the list 
            Collections.sort(tour);
            tours.add(tour);
        }
    }
    
}
//    road.remove(road.size() - 1);


public static void main(String[] args) {
    Scanner kulak = new Scanner(System.in);
    //scanner object kulak
    int Vertex = kulak.nextInt();
    int Edge = kulak.nextInt();

    TourGuide graph = new TourGuide(Vertex);
    
    for (int i = 0; i < Edge; i++) { //loop through
        int vertex1 = kulak.nextInt() - 1;
        int vertex2 = kulak.nextInt() - 1;
        graph.addEdge(vertex1, vertex2);
    }

    List<List<Integer>> tours = graph.getTours();

    if (tours.size() > 0) {
        System.out.println("Tours found:");
        for (List<Integer> tour : tours) {
            // print
            Collections.sort(tour);
        
            for (int i = 0; i < tour.size(); i++) {
                System.out.print(tour.get(i)+1);
                if (i < tour.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
}
}