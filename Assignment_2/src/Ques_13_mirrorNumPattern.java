import java.util.Scanner;

public class Ques_13_mirrorNumPattern {
    /*     1
         2 3 2
       3 4 5 4 3
     4 5 6 7 6 5 4  */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int row =1;
        int val = 1;
        while ( row<= n) {
            int space = 1;
            while (space <= n - row) {
                System.out.print(" " + " ");
                space = space + 1;
            }
            int col = 1;
            while (col <= (2 * row) - 1) {
                System.out.print(val);
                col = col +1;
            }
            if(row > col){
                val = val -1;
            }
            else{
                val = val +1;
            }
            System.out.println();
            row += 1;
        }
    }
}
