package Diziler;

public class ForEach {
    public static void main(String[] args){
/*        int[] list={1,2,3,4};

        int sum=0;
        for(int i:list){
            sum+=i;
            System.out.println(sum);
        }
 */
        int[][]matris={
                {1,2,3,0},
                {4,5,6,0,-1},
                {7,8,9,0,-2,-3},
        };

  /*      for(int j=0;j<matris.length;j++){
            for(int k=0;k<matris[j].length;k++){
                System.out.print(matris[j][k]+" ");
            }
            System.out.println();
        }

   */
        for(int[] sutun:matris){
            for(int sira:sutun) {
                System.out.print(sira+" ");
            }
            System.out.println();
        }
    }
}
