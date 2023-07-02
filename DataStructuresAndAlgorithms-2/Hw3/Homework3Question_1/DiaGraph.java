// Aleyna Alemdar - Aşkın Gündüz



import java.util.*;

class DiaGraph {
    
    private int NumberOfNodes;
    private List<List<int[]>> adjL;

    public DiaGraph(int NumberOfNodes) {
        
        this.NumberOfNodes = NumberOfNodes;
        adjL = new ArrayList<>(NumberOfNodes);
        
        for (int i = 0; i < NumberOfNodes; i++) {
            adjL.add(new ArrayList<>());
        // Initializing adjacencyy list 
        }
        
    }

    public void addEdge(int u, int v, int w) {
        adjL.get(u).add(new int[]{v, w});
    }

    public List<int[]> GetConnecting(int u) {
        return adjL.get(u);
      //  getting connecting nodes
    }
}