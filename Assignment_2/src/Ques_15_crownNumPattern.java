import java.util.Scanner;

public class Ques_15_crownNumPattern {
    /*   1           1
         1 2       2 1
         1 2 3   3 2 1
         1 2 3 4 3 2 1
                        */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int row =1;
        while (row <= n){
            int col1 =1;
            while (col1 <= row){
                System.out.print(col1+" ");
                col1 += 1;
            }
            int space = 1;
            while (space <= 2 * (n -row) -1){
                System.out.print(" "+ " ");
                space = space +1;
            }

            int col2 =row;
            if(row == n){
                col2 = row-1;
            }
            while (col2 >= 1){
                System.out.print(col2+" ");
                col2 -=1;
            }
            row = row +1;
            System.out.println();
        }

    }
}
