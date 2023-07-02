package hw2;
import java.util.Scanner;

public class Method {
	
    public static void Method(Integer[] arr, String sortOption) {

        if (sortOption.equalsIgnoreCase("insertion")) {
            Insertion.sort(arr);
            inverseSort(arr);
        } else if (sortOption.equalsIgnoreCase("selection")) {
            Selection.sort(arr);
            inverseSort(arr);

        } else if (sortOption.equalsIgnoreCase("merge")) {
            Merge.sort(arr);
            inverseSort(arr);

        } else if (sortOption.equalsIgnoreCase("quick")) {
            Quick.sort(arr);

        }
    }

    static Scanner keyboard = new Scanner(System.in);

	private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0; //using compareTo method for given array 
        //returns a boolean value!
    }
    
    
	 private static void exch(Comparable[] a, int i, int j) {
	        Comparable t = a[i];
	        a[i] = a[j]; //exchanges the indexes for given array !
	        a[j] = t;
	    }//this method returns nothing
	    
    

    public static int pairwiseDifference(Integer[] array) {
        int number=array.length; //assinging the length of given array
        int value = Integer.MAX_VALUE; //assigning the max value of ınt!!!
        int pair[]=new int[2]; //for looking the pairs i defined the range as "2"
        for (int i = 0; i < number - 1; i++) { // already sorted
       
            if (array[i + 1] - array[i] < value)
            {
                value = array[i + 1] - array[i];
                pair[0]=array[i];
                pair[1]=array[i+1];
            }
        }
        System.out.print(value+" ");
        System.out.print("["+pair[0]+" "+pair[1]+"]");
        return value; //returning the value! which this is int
    }
    
    

    public static void inverseSort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j - 1], a[j]); j--)
                exch(a, j - 1, j);
        }
    }

}