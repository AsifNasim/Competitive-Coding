import java.util.Scanner;

public class Ques_8_midZeroPattern {
    /*Pattern
       1
       2 2
       3 0 3
       4 0 0 4
       5 0 0 0 5
       */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int i =1;
        int val =1;
       while (i <= n){
           int j =1;
           while(j <= i) {
               if (j == 1  || j == i) {
                   System.out.print(val + " ");
               } else {
                   System.out.print("0"+" ");
               }
               j = j + 1;
           }
           i++;
           val++;
           System.out.println();
       }
    }
}
