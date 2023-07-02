package Soru1;

import java.io.InputStream;
import java.util.*;

public class Question1 {
    public final int Vertex; 
    public int Edge; 
    public int[] edgeTo;
    public int[] distTo;

    public Bag<Integer>[] adj; 

    // constructor to create a graph (input vertices!)
    public Question1(int Vertex) {
        this.Vertex = Vertex;
        adj = (Bag<Integer>[]) new Bag[Vertex]; // initializing 
        for (int v = 0; v < Vertex; v++) {
            adj[v] = new Bag<Integer>();// new bags are made for each vertex.
        }
        this.Edge = 0;
    }

    public int numEdges;
    public int numVertices;

    public boolean[] marked; //  array to determine if a vertex has been visited or not.

    // constructor for create graphs from input streams.
    public Question1(InputStream in) {
        Scanner kulak = new Scanner(in); // scanner object for reading the input

        this.Vertex = kulak.nextInt(); // reading
        adj = (Bag<Integer>[]) new Bag[Vertex]; // initializing

        int Edge = kulak.nextInt(); 

        for (int a = 0; a < Vertex; a++) {
            adj[a] = new Bag<Integer>(); //same 
        }

        
        for (int i = 0; i < Edge; i++) {
            int vertex1 = kulak.nextInt() - 1; // reading the edge's initial vertex
            int vertex2 = kulak.nextInt() - 1; // ending
            addEdge(vertex1, vertex2); // Adding edge
        }

        kulak.close(); // Closing scanner object
    }

    public int Vertex() {
        return Vertex;
    }

    public int Edge() {
        return Edge;
    }
//  to find the vertices that are near a particular vertex.
    public Iterable<Integer> adj(int vertex) {
        return adj[vertex]; //slayt
    }

    // to add an edge
    public void addEdge(int vertex1, int vertex2) {
        adj[vertex1].add(vertex2); // adding bag of vertex1 to vertex2
        adj[vertex2].add(vertex1); // adding bag of vertex2 to vertex1
        Edge++; // increment
    }

    /*
     *  breadth-first search !!
     */
    public void breadthfirstsearch(int startingVertex, int endingVertex) {
        edgeTo = new int[Vertex];
        marked = new boolean[Vertex];
        distTo = new int[Vertex];

        Queue<Integer> GraphQueue = new LinkedList<Integer>(); // creating a queue 

        GraphQueue.add(startingVertex); 

        marked[startingVertex] = true; // visiteddd

        while (GraphQueue.size() > 0) { // do this until the queue is empty
            int vertex1 = GraphQueue.remove(); // removing the first vertex from the queue

            for (int vertex2 : adj(vertex1)) { 
                if (!marked[vertex2]) { 
     
edgeTo[vertex2] = vertex1;


distTo[vertex2] = distTo[vertex1] + 1;

// mark visited
marked[vertex2] = true;

// Add vertex2 to the queue for further processing
GraphQueue.add(vertex2);
}

           if (vertex2 == endingVertex) {
// if the current vertex is the ending vertex, i have found a path from starting vertex to ending vertex


// if found a path, we need to traverse the edgeTo array to get the path from starting vertex to ending vertex
List<Integer> road = new ArrayList<Integer>();
int i;
for (i = vertex2; i != startingVertex; i = edgeTo[i]) {
    road.add(i);
}
road.add(i); 

numEdges = 0;
numVertices = 0;

//while traverse the road array, count the edges and vertices along the way.

for (i = 1; i < road.size(); i++) {
    int ud = road.get(i - 1);
    int ads = road.get(i);
    for (int add : adj(ud)) {
        if (add == ads) {
            numEdges++;
            break;
        }
    }
}
numVertices = (int) road.stream().distinct().count();

// print the output as desired 
System.out.println(road.size());
for (i = road.size()-1; i >= 0; i--) {
    System.out.print(road.get(i) + 1 + " ");
}
System.out.println();

// return after printing the shortest path
return;

        }
    }
}
}

/**
*  for returning the number of vertices
*/
public int getNumVertices() {
return numVertices;
}

/**
* returns the number of edges
*/
public int getNumEdges() {
return numEdges;
}

public static void main(String[] args) {
    Scanner kulak = new Scanner(System.in);
    int Vertex = kulak.nextInt();
    int Edge = kulak.nextInt();
    
    // reading input values from user ??
    int change_state = kulak.nextInt();
    int travel = kulak.nextInt();
    int middlepoint = travel - change_state;
    int calculate = change_state - middlepoint;

    Question1 graph = new Question1(Vertex);
    for (int i = 0; i < Edge; i++) {
        int v = kulak.nextInt() -1;
        int w = kulak.nextInt() - 1;
        graph.addEdge(v, w);
    }
    int startingEdge = kulak.nextInt();
    int finishingEdge = kulak.nextInt();

// use breadth-first search to determine the shortest route between the beginning and ending vertex.

    graph.breadthfirstsearch(startingEdge-1,finishingEdge-1);

    
    int answer = calculate * (graph.numVertices - 2) + travel * (graph.numEdges);
    System.out.println(answer);

   }
}