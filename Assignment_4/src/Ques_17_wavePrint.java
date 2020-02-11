import java.util.Scanner;

public class Ques_17_wavePrint {
    /*Take as input a two-d array. Wave print it row-wise E.g. for the following input array
    [[11, 12, 13, 14],
    [21, 22, 23, 24],
    [31, 32, 33, 34],
    [41, 42, 43, 44]] The output is
    11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41*/
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
//        int [][] result = wavePrint(arr);
        wavePrint(arr);

    }

    private static void wavePrint(int[][] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if(i%2 == 0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = arr[i].length -1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
