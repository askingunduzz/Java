import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

//        C:\Users\askin\OneDrive\Masaüstü\cmpe223 ödevi\Q1B\matrixb.txt
//        C:\Users\askin\OneDrive\Masaüstü\cmpe223 ödevi\Q1B\list1.txt
//          C:\Users\askin\OneDrive\Masaüstü\cmpe223 ödevi\Q1B\list2.txt
public class Solution {
    public static List<Integer> Order(int[][] matrix) {
        List<Integer> answer = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return answer;
        }
        int m = matrix.length, n = matrix[0].length;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                answer.add(matrix[x][y]);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        LinkedList<String> names = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input filename: ");
        String strr = scan.nextLine();
        Scanner sc = new Scanner(new BufferedReader(new FileReader(strr)));

        int row = 0, column = 0;
        String[] line2 = sc.nextLine().trim().split(" ");
        row++;
        for (int j = 0; j < line2.length; j++) {
            column++;
        }
        while (sc.hasNextLine()) {
            row++;
            sc.nextLine();
        }
        int[][] myArray = new int[row][column];
        sc.close();
        sc = new Scanner(new BufferedReader(new FileReader(strr)));
        while (sc.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        /*
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Order(myArray));

         */


        System.out.print("Input filename: ");
        String strr2 = scan.nextLine();
        Scanner sc2 = new Scanner(new BufferedReader(new FileReader(strr2)));

        String[] line4 = null;
        while (sc2.hasNextLine()) {
            line4 = sc2.nextLine().trim().split("-");
        }
    //    System.out.print(Arrays.toString(line4));
    //    System.out.println();

        List<String> list2 = Arrays.asList(line4);
        LinkedList<String> linkedList1 = new LinkedList<String>(list2);

  //      System.out.println("LinkedList2 : " + linkedList1);


        System.out.print("Input filename: ");
        String strr3 = scan.nextLine();
        Scanner sc3 = new Scanner(new BufferedReader(new FileReader(strr3)));

        String[] line = null;

        while (sc3.hasNextLine()) {
            line = sc3.nextLine().trim().split("-");
        }
     //   System.out.print(Arrays.toString(line));
      //  System.out.println();

        List<String> list = Arrays.asList(line);
        LinkedList<String> linkedList2 = new LinkedList<String>(list);

      //  System.out.println("LinkedList2 : " + linkedList2);
boolean cvp=false;
        for (int a = 0; a < line.length; a++) {
            int x = Integer.parseInt(line[a].split(",")[1]);
            int y = Integer.parseInt(line[a].split(",")[0]);
       //     System.out.println("x " + x);
        //    System.out.println("y " + y);
//            System.out.println(myArray[x][y]);
            String top=String.valueOf(y-1)+","+String.valueOf(x);
            String bottom=String.valueOf(y-1)+","+String.valueOf(x);
            String right=String.valueOf(y-1)+","+String.valueOf(x);
            String left=String.valueOf(y-1)+","+String.valueOf(x);
            int z=myArray[y][x];
           // System.out.println("z "+ z);
           // System.out.println("aaaaaa "+linkedList1.get(z));
            if(linkedList1.contains(top)&&linkedList1.contains(bottom)&&linkedList1.contains(right)&&linkedList1.contains(left)){

                cvp=true;
            }
            else{
                cvp=false;
            }
        }
        System.out.println(cvp);
      }
}