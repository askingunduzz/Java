package ödev2_part1;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	

    	
        int sayii[] = readFiles("/Users/berx/Desktop/HW2_q1/integers.txt");
        double sayilar2[]=readDFiles("/Users/berx/Desktop/doubles.txt");
   /*
         int sayii[] = readFiles("integers.txt");
         double sayilar2[] = readDFiles("doubles.txt");

       //FOR PUTTİNG VPL
    */

        int sayilar = sayii.length;
        int doubles=sayilar2.length;
        int sayilarMerge[] =readFiles("/Users/berx/Desktop/HW2_q1/integers.txt");
   
     /*   int sayilarMerge"[] = readFiles("integers.txt");
      /FOR PUTTİNG VPL
    */
        int value = sayilarMerge.length; 
        
        // you need to use Integer[] not int[] in order to use Comparable[]!!
        Integer[] arrMerge = new Integer[value]; // the range is must be equals to given text's length

        //filling the array with integers coming from the txt file
        for(int i=0; i < value; i++)
        {
            arrMerge[i] = sayilarMerge[i];
        }



        // you need to use Integer[] not int[] in order to use Comparable[] !!

        Integer[] array_1 = new Integer[sayilar]; //the ranges are must be equals to given txt's length
        Double[] array_2= new Double[doubles];



        //now, filling the array with integers coming from txt file
        for (int i = 0; i < sayilar; i++) {
            array_1[i] = sayii[i]; //for int
        }

        for(int j=0;j<doubles;j++){ //for double
            array_2[j]=sayilar2[j];
        }




        System.out.println("Integers are reading from the integers.txt file, the array is:");
        printIntArray(array_1);
        System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
        Insertion.sort(array_1);
        printIntArray(array_1);
        System.out.println("Step 1 has been completed.");
        System.out.println();
        System.out.println();
        
        
        System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
        Insertion.inverseSort(array_1);
        printIntArray(array_1);
        System.out.println("Step 2 has been completed.");
        System.out.println();
        
        
        System.out.println("Doubles are reading from the doubles.txt file, the array is:");
        printDoubleArray(array_2);
        Insertion.sort(array_2);
        System.out.println("The array of double values has been sorted in increasing order by using the insertion sort algorithm:");
        printDoubleArray(array_2);
        System.out.println("Step 3 has been completed.");
        System.out.println();
        
        
        System.out.println("The original array is:");
        printIntArray(arrMerge);
        System.out.println("The array of integer values has been sorted in descending order by using the merge sort algorithm is:");
        Merge.sort(arrMerge);
        Merge.reverseOrder(arrMerge);
        printIntArray(arrMerge);
        System.out.println("Step 4 has been completed.");
        System.out.println();
        
        Route obj0 = new Route ("Ankara","Antalya");
        Route obj1 = new Route ("Ankara", "Istanbul");
        Route obj2 = new Route ("Istanbul","Antalya");
        Route obj3 = new Route ("Antalya", "Izmir");
        Route obj4 = new Route ("Izmir","Antalya");
        Route obj5 = new Route ("Izmir", "Ankara");		
        Route obj6 = new Route ("Antalya","Ankara");
        Route obj7 = new Route ("Ankara", "Izmir");	
        Route obj8 = new Route ("Istanbul","Izmir");
        Route obj9 = new Route ("Istanbul", "Ankara");	
        
       Route [] objarray = {obj0,obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9};
       Quick.sort(objarray);
       Route.show(objarray);

        System.out.println("Step 6 has been completed.");
    }

    public static int[] readFiles(String file) { //for reading int
        //also these are codes given
        try {
            File f = new File(file);
            Scanner s = new Scanner(f);
            int n = 0;

            while (s.hasNextInt()) { //when scanner reads an integer,the value of n must be increased 1
                n++;
                s.nextInt();
            }
            int S[] = new int[n]; //the value of n determing the length of the array
            //  double SS[]=new double[n];
            Scanner s1 = new Scanner(f);

            for (int i = 0; i < S.length; i++)
                S[i] = s1.nextInt(); //in this for loop we are assing the every int to another index of array

            return S; //finally return the array which successfully read

        } catch (Exception e) {
            return null;
        }
    }

    public static double[] readDFiles(String file){ //for readind double values
        //also trying to catch exceptions
        try {
            File f = new File(file);
            Scanner s = new Scanner(f);
            int d = 0;

            while (s.hasNextDouble()) {
                d++;
                s.next();
            }
            double D[] = new double[d];
            //  double SS[]=new double[n];
            Scanner s1 = new Scanner(f);

            for (int i = 0; i < D.length; i++)
                D[i] = Double.valueOf(s1.next());

            return D;

        } catch (Exception e) {
            return null;
        }
    }



    public static void printIntArray(Integer[] arr) //for printing the int array

    {
        for (int i = 0; i < arr.length; i++) //for loop will be iterating as much as the length of array
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    public static void printDoubleArray(Double[] arr) { //same process for printing the double array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");}
        System.out.println();
    }


}
        




