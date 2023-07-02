
// Aleyna Alemdar - Aşkın Gündüz


class Node implements Comparable<Node> {
    int ID,fee;

    public Node(int ID, int fee) {
        this.ID = ID;
        this.fee = fee;
    }

    public int compareTo(Node other) {
        return Integer.compare(this.fee, other.fee);
        //   compares fees of nodes then returning 
    }
}