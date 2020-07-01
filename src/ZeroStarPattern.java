import java.util.Scanner;

public class ZeroStarPattern {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int input = s.nextInt();
        int row = 1;
        while (row <= input){
            int col = 1;
            while (col <= 2*input+1){
                if(col == row || (col == (2*input)-row+2 ) || col == input+1 ) {
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
