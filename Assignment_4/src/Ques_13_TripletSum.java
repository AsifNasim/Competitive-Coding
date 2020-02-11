import java.util.Arrays;
import java.util.Scanner;

public class Ques_13_TripletSum {
    /* Take as input N, the size of array. Take N more inputs and store that in an array.
       Take as input “target”, a number. Write a function which prints all triplets
       of numbers which sum to target.E.g. For this array => 3, 1, 9, 7, 5, -1 and target
       of 9 the output is -1, 1 and 9; -1, 3 and 7; 1, 3 and 5. */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        tripletSum(arr, target);
    }

    private static void tripletSum(int[] arr, int target) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if (arr[i]+arr[j]+arr[k] == target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);

                    }

                }
            }

        }
        System.out.println();
    }
}
