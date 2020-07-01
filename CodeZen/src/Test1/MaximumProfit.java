package Test1;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfit {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        int [] newArr = new int[size];
        for (int i = 0; i <size; i++) {
            newArr[i] =(size -i) * (arr[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i : newArr) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}
