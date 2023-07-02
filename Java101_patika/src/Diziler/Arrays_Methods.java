package Diziler;

import java.util.Arrays;

public class Arrays_Methods {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        double[] aa = {1, 2, 3, 4};

  /*    HelperArray helper=new HelperArray();
        helper.print(list);
        System.out.println();
        helper.print(aa);

   */
        //Arrays.toString methodu:
        System.out.println(Arrays.toString(aa));

        //Arrays.fill() methodu:
        Arrays.fill(list, 2, 5, 10);
        System.out.println(Arrays.toString(list));
        Arrays.fill(list, 10);
        System.out.println(Arrays.toString(list));

        int[] list2 = {43, 2, 3, 6, 96, 10};
        //Arrays.sort() methodu:
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));
        int[] list3 = {1, 3, 5, 2, 4, 6, 45, -3, -53, -21, 89, 1002};
        //Arrays.binarySearch() methodu:
        //once siralamak onemli
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));
        System.out.println(Arrays.binarySearch(list3, 5));

        int[] list4={2,5,3,8,10,1};
        int[] list5={3,5,234,3,-2,12,-1};
        //Arrays.copyOf() ve Arrays.copyOfRange() methodlari:
        int[] copyList=Arrays.copyOf(list4,4);
        System.out.println(Arrays.toString(copyList));
        int[] copyRangeList=Arrays.copyOfRange(list5,3,6);
        System.out.println(Arrays.toString(copyRangeList));

        int[] list6={1,2,3,4,5};
        int[] list7={5,6,7,8,9,10};
        int[] list8={1,2,3,4,5};
        //Arrays.equals() methodu:
        System.out.println(Arrays.equals(list6,list7));
        System.out.println(Arrays.equals(list6,list8));



    }
}
