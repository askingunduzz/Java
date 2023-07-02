//ALEYNA ALEMDAR- AŞKIN GÜNDÜZ
// Class to represent a heap-based priority queue
class PriorityQueue {
    private Customer[] heap;
    private int size;
// Constructor for a priority queue, taking in the capacity of the heap as a parameter
public PriorityQueue(int capacity) {
    // the heap array
    heap = new Customer[capacity];
}

// check if the queue is empty
public boolean isEmpty() {
    return size == 0;
}

// add a customer to the queue
public void add(Customer c) {
    // Add the customer to the end of the heap
    heap[size] = c;
    size++;

    // getting the customer up to the correct position
    int index = size - 1;
    while (index > 0 && heap[index].compareTo(heap[(index - 1) / 2]) > 0) {
        // Swap the customer with its parent
        Customer temp = heap[index];
        heap[index] = heap[(index - 1) / 2];
        heap[(index - 1) / 2] = temp;

        index = (index - 1) / 2;
    }
}

// to get the customer at the front of the queue without removing it
public Customer peek() {
    return heap[0];
}

//removing the customer at the front of the queue
public Customer poll() {
    // Check if the queue is empty
    if (isEmpty()) {
        return null;
    }

   
    Customer c = heap[0];

    // Remove the last customer from the heap and put it at the front
    heap[0] = heap[size - 1];
    size--;
    
   // put the customer down to the correct position
 
    int index = 0;
    while (index * 2 + 1 < size) {
        int childIndex = index * 2 + 1;
        if (childIndex + 1 < size && heap[childIndex].compareTo(heap[childIndex + 1]) < 0) {
            childIndex++;
        }
        if (heap[index].compareTo(heap[childIndex]) > 0) {
            break;
        }
        Customer temp = heap[index];
        heap[index] = heap[childIndex];
        heap[childIndex] = temp;
        index = childIndex;
    }

    
    return c;
}

// Method to get the size of the queue
public int size() {
    return size;
}

}