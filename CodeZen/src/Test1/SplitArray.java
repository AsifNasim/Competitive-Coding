package Test1;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = s.nextInt();
        }

        System.out.println(splitArray(arr));
    }

    private static boolean splitArray(int[] arr) {
        return splitArray(arr,0,arr.length-1,0,0);
    }

    private static boolean splitArray(int[] arr, int start, int end, int lSum, int rSum) {
        if(start>end) {

            return lSum==rSum;

        }
        if(arr[start] % 5==0) {
            return splitArray(arr, start+1, end, lSum + arr[start], rSum);
        }
        else if(arr[start] %3==0) {
            return splitArray(arr, start+1, end, lSum, rSum+arr[start]);
        }
        else {
            return splitArray(arr, start+1, end, lSum+arr[start], rSum) || splitArray(arr, start+1, end, lSum, rSum+arr[start]);
        }

    }

//    private static boolean splitArray(int[] arr) {
//        Arrays.sort(arr);
//        int sum1 = 0, sum2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%5 == 0 ){
//                sum1 += arr[i];;
//            }
//            else if(arr[i]%3 == 0 && arr[i]%5 != 0){
//                sum2 += arr[i];
//            }
//            else if(arr[i]%3 != 0 && arr[i]%5 != 0){
//                sum2 += arr[i];
//            }
//        }
//
//        if (sum1 == sum2){
//            return false;
//        }
//        else{
//            return true;
//        }
//    }
}
