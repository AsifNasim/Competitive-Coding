package Sorting;

import java.util.Scanner;

public class InsertionSort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        insertionSort(arr);
        utils.display(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int j = 1; j <=arr.length-1 ; j++) {
            // picking the first element
            int key = arr[j];
            int i = j-1;
            while ( i>= 0 && arr[i] > key){
//                arr[i+1] = arr[i];
                utils.swap(arr, i+1,i);
                i = i-1;
            }
            arr[i+1] = key;
        }
    }
}
