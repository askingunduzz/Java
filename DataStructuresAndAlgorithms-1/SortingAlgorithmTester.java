package hw2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithmTester {
	
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Random echo = new Random(); // creating Random object
        
        System.out.println("Enter a seed to create random generated values:");
        
        int seed = keyboard.nextInt(); //same -11
        
        System.out.println("seed : " + seed);
        
        Integer[] size = {250, 1000, 100, 10, 16000}; //sizes of inputs
        Integer[] array = null; // i initialized the array null because of the error!
        
        for (int i = 0; i < size.length; i++) { 

            System.out.print("Input size: " + size[i]);
            System.out.println();
            array = new Integer[size[i]];

            for (int j = 0; j < array.length; j++) {
                array[j] = echo.nextInt();
            }
           
            String aleyna;
            String[] sortOptions = {"Selection", "Insertion", "Merge", "Quick"};
            //defining an array 
            
            for (int sort = 0; sort < sortOptions.length; sort++)
            {
            	//for loop looking all of them
                aleyna = sortOptions[sort];
                System.out.println("Sort option: " + aleyna);
                System.out.println("Random:");

                Long[] times = new Long[3];//this code is given
                
                for (int kk = 0; kk < 3; kk++) {
                    Method.Method(array, aleyna);
                    Method.pairwiseDifference(array);
                    System.out.println();
                    
                    for (int j = 0; j < 3; j++) {
                        Long time1 = System.currentTimeMillis();
                        Method.Method(array, sortOptions[kk]);
                        Long time2 = System.currentTimeMillis();
                        times[j] = time2 - time1;

                    }
                }
                
                    Insertion.sort(times);
                    System.out.println("Time: " + times[1]);
       
                    //ASCENDİNG 
                System.out.println("Ascending:");
                
                for (int b = 0; b < 3; b++) {
                    Method.Method(array, aleyna);
                    Method.pairwiseDifference(array);
                    System.out.println();
                    for (int j = 0; j < 3; j++) {
                        Long time1 = System.currentTimeMillis();
                        Method.Method(array, sortOptions[b]);
                        Long time2 = System.currentTimeMillis();
                        times[j] = time2 - time1;

                    }
                }
                
                Insertion.sort(times);
                System.out.println("Time: " + times[1]);

                //DESCENDİNG
                System.out.println("Descending:");
                for (int b = 0; b < 3; b++) {
                    Method.Method(array, aleyna);
                    Method.pairwiseDifference(array);
                    System.out.println();
                    
                    for (int j = 0; j < 3; j++) {
                        Long time1 = System.currentTimeMillis();
                        Method.Method(array, sortOptions[b]);
                        Long time2 = System.currentTimeMillis();
                        times[j] = time2 - time1;

                    }
                }
                
                Insertion.sort(times);
                System.out.println("Time: " + times[1]);

            }
        }
    }
}