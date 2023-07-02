package hw2;


public class Selection {
	
    public static void sort(Comparable[] a)
    { // Sortting the given array "a" into increasing order.
    	
        int N = a.length; // array length
        
        for (int i = 0; i < N; i++)
        { // Exchange a[i] with smallest entry in a[i+1...N).
            int min = i; // minimal entry's index
            
            for (int j = i+1; j < N; j++) 
                if (less(a[j], a[min])) min = j;
            exch(a, i, min); //calling the exch method for exchaning the indexes 
        }
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
		    }
}
