import java.util.Scanner;

public class patternUsingrecursion {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = s.nextInt();
        int col = s.nextInt();
        pattern(row, col);
    }

    private static void pattern(int row, int col) {
        if(row == 0){
            return;
        }
        if(row == col){
            System.out.println();
            pattern(row-1, 0);
            return;
        }
        System.out.print("*"+" ");
        pattern(row, col +1);

    }

}
