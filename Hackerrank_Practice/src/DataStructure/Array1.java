package DataStructure;

import java.util.Scanner;

public class Array1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int [] ans = revOrderArr(arr);
        utils.display(ans);
    }

    private static int[] revOrderArr(int[] arr) {
        int i =0;
        int j = arr.length-1;
        while (i <= j/2){
            utils.swap(arr, i,j);
            i++;
            j--;
        }
        return arr;
    }
}
