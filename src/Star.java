import java.util.Scanner;

public class Star {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int row =1;
        while (row <= n){
            int col = 1;
            while (col<= row){
                System.out.print("*"+" ");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
