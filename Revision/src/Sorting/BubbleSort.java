package Sorting;

import java.util.Scanner;

public class BubbleSort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        bubbleSort(arr);
        utils.display(arr);
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] > arr[j]){
                    utils.swap(arr,i,j);
                }
            }
        }
    }


}
