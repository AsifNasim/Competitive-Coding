import java.util.Scanner;

public class Ques_1 {
    /*Pattern*/
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int val = 1;
        int row =1;
        while(row <= n){


            int space = 1;
            while(space <= n-row){
                System.out.print(" ");
                space += 1;
            }
            int col =1;
            while (col <= (2*row)-1){
                if(col >= row-1){
                    val = val-1;
                    System.out.print(val+1);
                }
               else {

                    System.out.print(val);
                    val++;
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
