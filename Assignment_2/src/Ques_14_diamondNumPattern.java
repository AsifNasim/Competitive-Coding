import java.util.Scanner;

public class Ques_14_diamondNumPattern {
    /*      1
          2 3 2
        3 4 5 4 3
          2 3 2
            1       */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();

        int row =1;
        int k =1;
        int val =0;
        while ( k <= n){
            int space = 1;
            while (space <= n -row){
                System.out.print(" "+" ");
                space = space +1;
            }
            int col = 1;
            while ( col <= (2* row) -1){
                if(col<= row){
                    val = val +1;
                    System.out.print(val +" ");

                }
                else {
                    val = val -1;
                    System.out.print(val +" ");
                }
                col = col+1;
            }
            if(k < n){
                row = row +1;
            }
            else {
                row =row -1;
            }
            k = k+1;
            System.out.println();
        }
    }
}
