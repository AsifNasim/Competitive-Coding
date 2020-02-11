import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques_14_sumOfTwoArrays {
    /*Take as input N, the size of array. Take N more inputs and store that in an array.
    Take as input M, the size of second array and take M more inputs and store that in second
    array. Write a function that returns the sum of two arrays.Print the value returned.
    E.g. Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size_1 = s.nextInt();
        int[] arr_1 = new int[size_1];
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = s.nextInt();
        }
        int size_2 = s.nextInt();
        int[] arr_2 = new int[size_2];
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = s.nextInt();
        }
        sumOfTwoArrays(arr_1, arr_2);

    }

    private static void sumOfTwoArrays(int[] arr_1, int[] arr_2) {
        int sum1 = 0;
        int num_1 = 0;
        for (int i = 0; i < arr_1.length; i++) {
            num_1 += arr_1[i] * (int) Math.pow(10, arr_1.length - 1 - i);
        }
        int num_2 = 0;
        for (int j = 0; j < arr_2.length; j++) { 
            num_2 += arr_2[j] * (int) Math.pow(10, arr_2.length - 1 - j);
        }

        num_1 += num_2;
        sum1 = num_1;
        int len = size(sum1);
        for (int i = len-1; i >= 0; i--) {
            int sum = sum1;
            int digit = sum/(int)Math.pow(10,i);
            System.out.print(digit+", ");
            sum1%=(int)Math.pow(10,i);
        }
        System.out.print("END");


    }

    private static int size(int sum){
        int count = 0;
        while (sum >0){
            int lastIndex = sum%10;
            count++;
            sum /= 10;
        }
        return count;
    }

}
