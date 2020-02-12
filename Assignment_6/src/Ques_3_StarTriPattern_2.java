import java.util.Scanner;

public class Ques_3_StarTriPattern_2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        pattern(n,0);
    }

    private static void pattern(int row, int col) {
        if(row == 0){ // Base case
            return;
        }
        if(row == col){ // to jump on next row
            System.out.println();
            pattern(row-1, 0);
            return;
        }

        System.out.print("*"); // printing the star on that particular row
        pattern(row, col+1);
    }
}
