import java.util.Scanner;

public class PatternPractice {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int k =1;
        int row = 1;
        while (k <= n){
            if(row == 1 || row == n){
                int col = 1;
                while(col <= n){
                    System.out.print("*\t");
                    col= col+1;
                }
            }
            else{
                int col1 = 1;
                while (col1 <= (n-(row-1))/2){
                    System.out.print("*\t");
                    col1 = col1+1;
                }
                int space = 1;
                while(space <= 2 * (row -1)-1){
                    System.out.print("\t");
                    space = space+1;
                }
                int col2 = 1;
                while (col2 <=(n-(row-1))/2 ){
                    System.out.print("*\t");
                    col2= col2+1;
                }
            }
            if(k < n/2+1){
                row = row+1;
            }
            else{
                row = row -1;
            }
            k = k+1;
            System.out.println();
        }
    }
}
