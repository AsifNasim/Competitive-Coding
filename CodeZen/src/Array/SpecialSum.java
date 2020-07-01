package Array;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class SpecialSum {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int res = specialSum(arr);
        System.out.println(res);
    }

    private static int specialSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }
        int anotherSum = sum;
        while (anotherSum > 10){
            int singleSum = 0;
            while (sum != 0){
                int rem = sum%10;
                singleSum += rem;
                sum = sum/10;
            }
            if(singleSum < 10){
                return singleSum;
            }
            anotherSum = singleSum;
            sum = singleSum;
            singleSum = 0;
        }


//        int singleSum = sum;
//        while (singleSum > 10){
//            while (sum != 0){
//                int rem = sum%10;
//                singleSum += rem;
//                sum = sum/10;
//            }
//
//            if(singleSum < 10){
//                return singleSum;
//            }
//            sum = singleSum;
//        }



       return -1;
    }
}
