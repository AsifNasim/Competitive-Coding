import java.util.Scanner;
public class RhombusPattern {
    /*         1
             23
           345
         4567
      */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int val = 1;
        int row = 1;
        while (row <= n) {
            int space = 1;
            while (space <= 2 * (n - row)) {
                System.out.print(" ");
                space++;
            }
            val = row;
            int col = 1;
            while (col <= row) {
                System.out.print(val);
                val++;
                col++;
            }
            row++;
            System.out.println();
        }
}
}
