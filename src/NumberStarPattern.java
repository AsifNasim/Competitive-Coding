import java.util.Scanner;

public class NumberStarPattern {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int input = s.nextInt();
        int row = 1;
        while (row <= input){
            int col = input;
            while (col >= 1){
                if(col == (row)){
                    System.out.print("*");
                }
                else{
                    System.out.print(col);
                }
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
