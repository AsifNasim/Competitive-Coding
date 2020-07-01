package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Unique {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.print(findUniqueEfficient(arr));
    }

    private static int findUnique(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i = i+2) {
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    private static int findUniqueEfficient(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans  = ans^arr[i];
        }
        return ans;
    }

}
