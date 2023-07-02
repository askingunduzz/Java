package Diziler;

import java.util.Arrays;

//tekrar eden cift sayilari bul
public class Tekrar_Eden_Sayilar {
    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 4, 5, 6, 2, 3, 4, 9, 1, 2, 3, 4, 9,6,8,6,2};  //Scanner ile koy
        Arrays.sort(list); //sirali koysun diye
        int[] list2 = new int[list.length];
        int k = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])&&(list[i]%2==0)) {
                    if (!isFind(list2, list[i])) { //false ise
                        list2[k++] = list[j];
                    }
                    break;
                }
            }
        }
       // System.out.println(Arrays.toString(list2));

        for(int value:list2){
            if(value!=0){
                System.out.print(value+" ");
            }
        }
    }

}

