import java.util.Scanner;

public class Ques_6 {
//   Star Pattern
    /*           *
            *    *    *
        *   *    *    *   *
            *    *    *
                 *
                                     */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
       int n = s.nextInt();
        int row =1;
        int k =1;
        while(k<=n){
            int space =1;
            while(space <= n -row){
                System.out.print(" ");
                space = space +1;
            }
            int col =1;
            while(col <= (2*row)-1){
                System.out.print("*");
                col = col +1;
            }
            if(k< (n/2)+1){
                row = row +1;
            }
            else{
                row = row - 1;
            }
            System.out.println();
            k = k+1;

        }

    }
}
