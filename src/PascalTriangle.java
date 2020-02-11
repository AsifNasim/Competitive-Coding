import java.util.Scanner;

public class PascalTriangle {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int n = s.nextInt();
        int val =0;
        int row =1;
        while (row <= n){
            int space =1;
            while (space <= n- row){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col <= 2*row-1){
                if(col<= row){
                    val++;
                    System.out.print(val);
                }
                else {
                    val--;
                    System.out.print(val);
                }
                col++;
            }
            System.out.println();
            row++;
        }

    }

}
