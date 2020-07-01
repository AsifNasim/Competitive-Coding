package StringAndTwoDArray;

import java.util.Scanner;

public class RowWiseSum {
    static  Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        rowWiseSum(arr);
    }

    private static void rowWiseSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}
