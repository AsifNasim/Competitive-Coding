import java.util.*;
public class ManmohanLovesPattern_1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        int n = s.nextInt();
        int row = 1;
        while(row <= n){
            int col = 1;
            while(col <=row){
                if(row%2 != 0){
                    System.out.print("1");
                }
                else if(col == 1 || row == col){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                col++;

            }
            row++;
            System.out.println();
        }
    }
}
