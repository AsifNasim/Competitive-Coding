import java.util.Scanner;

public class HollowDiamondPattern_6 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int row =1;
        int k =1;
        while(row <= n){
            if(row == 1 || row == n){
                int col = 1;
                while (col <= n){
                    System.out.print("*\t");
                    col++;
                }
            }
            else if(row <= n/2+1){
                int col = 1;
                while(col <= n/2 -row +2){
                    System.out.print("*\t");
                    col = col+1;
                }
                int col2 = 1;
                while (col2 <= 2*(row-1) -1){
                    System.out.print("\t");
                    col2++;
                }
                int col3 =0;
                while(col3 <= (n/2)-row +1){
                    System.out.print("*\t");
                    col3++;
                }
                if(row == n/2+1){
                    k = 3;
                }
            }
            else{
                int col = 0;
                while(col <= (row-k)+1){
                    System.out.print("*\t");
                    col++;
                }

                int col1 = 0;
                while (col1 < row-k+1){
                    System.out.print("\t");
                    col1++;
                }
                int col2 =0;
                while (col2 <= (row-k)+1){
                    System.out.print("*\t");
                    col2++;
                }
            }
            k = k+1;
            row = row+1;
            System.out.println();
        }
    }
}
