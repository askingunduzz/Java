package Metotlar;

public class recursion {
  /*  static int f(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }
  */
        static int r(int x){
            int result = 0;
            if(x>0) {
                result=x+r(x-1);
                return result;
            }
            else{
                return 0;
            }
        }
        public static void main (String args[]){
            System.out.print(r(10));

        }
    }
