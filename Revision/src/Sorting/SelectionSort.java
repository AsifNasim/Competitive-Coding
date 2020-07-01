package Sorting;

import java.util.Scanner;

public class SelectionSort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        selectionSort(arr);
        utils.display(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j <= arr.length-1 ; j++) {
                if (arr[j] < arr[i]){
                    min = j;
                }
            }
            utils.swap(arr,min, i);
        }
    }
}
