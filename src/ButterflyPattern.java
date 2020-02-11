import java.util.Scanner;

public class ButterflyPattern {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        n = n/2;
        int row = 1;
        int k = 1;
        while (k <= 2 * n - 1) {
            int col = 1;
            int sideMirror = 1;
            while (sideMirror <= 2 * n - 1) {
                if (col <= row) {
                    System.out.print("*" + " ");
                    sideMirror++;
                } else {
                    System.out.print(" " + " ");
                    sideMirror++;
                }

                if (sideMirror < n) {
                    col += 1;
                } else {
                    col -= 1;
                }
                sideMirror++;
            }
                k = k + 1;
                System.out.println();
            }
        }
    }
