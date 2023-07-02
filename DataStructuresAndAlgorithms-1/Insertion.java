package hw2;

public class Insertion {

	private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0; //using compareTo method for given array 
        //returns a boolean value!
    }
    
    
	 private static void exch(Comparable[] a, int i, int j) {
	        Comparable t = a[i];
	        a[i] = a[j]; //exchanges the indexes for given array !
	        a[j] = t;
	    }//this method returns nothing
	    
    
	 public static void sort(Comparable[] a) { 
	    	// for the increasing order!!!
	        int N = a.length; //for loop will be iterating as length of the given array times
	        
	        for (int i = 1; i < N; i++) { // Inserting the given array "a[i]" among a[i-1], a[i-2], a[i-3]... ..
	            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) 
	            	
	            	//calling the less method and comparing the values of indexes  
	            	
	                exch(a, j, j - 1); //calling the exch method for changing the indexes
	        }
	    }//this method returns nothing
	    
        
        
        // System.out.println(SortingAlgorithmTester.time());
    }

