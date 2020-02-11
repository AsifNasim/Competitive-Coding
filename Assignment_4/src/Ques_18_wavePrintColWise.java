import java.util.Scanner;

public class Ques_18_wavePrintColWise {
    /*Take as input a two-d array. Wave print it column-wise E.g. for the following input
    array [[11, 12, 13, 14], 
    [21, 22, 23, 24], 
    [31, 32, 33, 34],
    [41, 42, 43, 44]] 
    The output is 11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14 */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        wavePrintColWise(arr);
    }

    private static void wavePrintColWise(int[][] arr) {


        for (int i = 0; i < arr[0].length; i++) {
            if (i%2 == 0)
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            else{
                for (int k = arr.length-1; k >= 0 ; k--) {
                    System.out.print(arr[k][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
