import java.util.*;
public class patternHollowRhombus {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        int n = s.nextInt();
        int row = 1;
        while(row <= n){
            int space = 1;
            while(space <= n- row){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while(col <= row){
                if(row == 1 || row == n && col <= row){
                    System.out.print("*");
                    col++;
                }
                else {
                    System.out.print(" ");
                    col++;
                }
                System.out.println();
                row++;
            }
        }
    }
}