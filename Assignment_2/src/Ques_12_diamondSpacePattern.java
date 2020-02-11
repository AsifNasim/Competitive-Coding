import java.util.Scanner;

public class Ques_12_diamondSpacePattern {
    /*     * * *   * * *
           * *       * *
           *           *
           * *       * *
           * * *   * * *
      */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int row = 1;
        int k = 1;
        while ( k <= n){
            int col1 = 1;
            while (col1 < (n - row)){
                System.out.print("*"+" ");
                col1 = col1 +1;
            }
            int space = 1;
            while (space <= 2*row -1){
                System.out.print(" "+" ");
                space = space +1;
            }
            int col2 = 1;
            while (col2 < n -row){
                System.out.print("*"+" ");
                col2 = col2 +1;
            }
            if(k < n/2 +1){
                row += 1;
            }
            else {
                row -= 1;
            }
            k = k+1;
            System.out.println();
        }
    }


}
