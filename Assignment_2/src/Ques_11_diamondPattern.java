import java.util.Scanner;

public class Ques_11_diamondPattern {
    /*   *
       * * *
     * * * * *
       * * *
         *     */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int row = 1;
        int k =1;
        while (k <= 2*n -1){
            int space = 1;
            while (space <= n -row){
                System.out.print(" "+" ");
                space += 1;
            }
            int col =1;
            while (col <= (2*row) -1){
                System.out.print("*"+" ");
                col += 1;
            }
            if(k < n/2 +1){
                row += 1;
            }
            else {
                row -= 1;
            }
            k+=1;
            System.out.println();
        }
    }
}
