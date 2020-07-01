package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StocksAreProfitable {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int [] arr = utils.takeInput();
        System.out.println(stocks(arr));
    }

    private static int stocks(int[] arr) {
//        Arrays.sort(arr);
        int maxNum = max(arr);
        int profit = maxNum - arr[0];
        return profit;
    }

    private static int max(int [] arr){
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }

        }
        return maxNum;
    }
}
