package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class _2DArray {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println(hourGlassSum(arr));
    }

    private static int hourGlassSum(int[][] arr) {
//        ArrayList list = new ArrayList();
        int [] max = new int[10001];
        for (int i = 0; i < arr.length-2; i++) {


                for (int j = 0; j < arr[i].length-2; j++) {
                    int sum = 0;
                    sum += arr[i][j]+ arr[i][j+1]+ arr[i][j+2]
                                    +arr[i+1][j+1]+
                            arr[i+2][j]+ arr[i+2][j+1]+ arr[i+2][j+2];
                    max[i] = sum;
                }

        }
        int ans = maxElem(max);
        return ans;
    }

    private static int maxElem(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
