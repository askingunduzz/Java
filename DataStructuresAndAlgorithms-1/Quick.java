package hw2;


import hw2.StdRandom;

public class Quick {
//divide and conquer algorithm!!!
	
    public static void sort(Comparable[] a)
    {
        StdRandom.shuffle(a); // Eliminate dependence on input.
        sort(a, 0, a.length - 1); //calling the sort method
    }
    //returns nothing ,because this method is void
    
    
    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) 
          return;
        int j = partition(a, lo, hi); // Partition the array
        sort(a, lo, j-1); // Sortting left part which recursive 
        sort(a, j+1, hi); // Sortting right part which recursive
    }
    
    
    
    private static int partition(Comparable[] a, int lo, int hi)
    { // Partition into a[lo..i-1], a[i], a[i+1..hi].
        int i = lo;
        int j = hi+1; // left and right scan indices
        Comparable v = a[lo]; // partitioning item
        while (true)
        { // Scan right, scan left, check for scan complete, and exchange.
            while (less(a[++i], v)) if (i == hi) 
             break;
            while (less(v, a[--j])) if (j == lo) 
             break;
            if (i >= j) 
             break;
            exch(a, i, j); //calling the exch method for exchanging
        }
        
        exch(a, lo, j); // Put v = a[j] into position
        return j; // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }
    
    
    

	private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0; //using compareTo method for given array 
        //returns a boolean value!
    }
    
    
	  
		 private static void exch(Comparable[] a, int i, int j) {
		        Comparable t = a[i];
		        a[i] = a[j]; //exchanges the indexes for given array !
		        a[j] = t;
		    }//this method returns nothing

		
		 
public static void inverseSort(Comparable[] a) {
    int N = a.length;
    for (int i = 1; i < N; i++) { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
        for (int j = i; j > 0 && less(a[j - 1], a[j]); j--)
            exch(a, j - 1, j);
    }
} }