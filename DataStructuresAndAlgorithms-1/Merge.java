package ödev2_part1;
public class Merge {
	
	

	
	
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0; //using compareTo method for given array 
        //returns a boolean value!
    }
    
    
    
  
  public static void merge(Comparable[] a, int lo, int mid, int hi)
  { // Merge a[lo..mid] with a[mid+1..hi].
      int i = lo, j = mid+1;
      for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
          temp_arr[k] = a[k];
      for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
          if (i > mid) a[k] = temp_arr[j++];
          else if (j > hi ) a[k] = temp_arr[i++];
          else if (less(temp_arr[j], temp_arr[i])) a[k] = temp_arr[j++];
          else a[k] = temp_arr[i++];
  }//returns nothing

  
  private static Comparable[] temp_arr; //defining an axuiliary array which for merge process 
  
  
  public static void sort(Comparable[] a)
  {
      temp_arr = new Comparable[a.length]; // the length of array temp_arr same with the array "a"
      sort(a, 0, a.length - 1); //calling the sort method!
  }//returns nothing
  
  
  
  private static void sort(Comparable[] a, int lo, int hi) 
  { // Sort a[lo..hi].
      if (hi <= lo) return;
      int mid = lo + (hi - lo)/2;
      sort(a, lo, mid); // for sortting the left half of an array
      sort(a, mid+1, hi); // for sortting the right half an array
      merge(a, lo, mid, hi); // calling the merge method for merging these two halfs
  }
 
  
  
  
  public static Integer[] reverseOrder(Integer[] array){ //for finding the descending order 
      int maxIndex = array.length - 1;
      int halfLength = array.length / 2;
      for (int i = 0; i < halfLength; i++) {
          int temp = array[i];
          array[i] = array[maxIndex - i];
          array[maxIndex - i] = temp;
      }
      return array;
  } // returns Integer [] 
  
  
  private static void show(Comparable[] a)
  { // Print the array, on a single line.
      for (int i = 0; i < a.length; i++){ //for loop works as the length of the array times
          System.out.print(a[i] + " ");}
      System.out.println(); 
  } //returns nothing
  
  
  
}
