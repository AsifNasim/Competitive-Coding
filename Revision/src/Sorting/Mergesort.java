package Sorting;

import java.util.Scanner;

public class Mergesort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int [] ans = mergeSort(arr,0, arr.length-1);
        utils.display(ans);
    }

    private static int [] mergeSort(int[] arr, int start, int end) {
        if (start == end){
            int [] br = new int[1];
            br[0] = arr[start];
            return br;
        }

        int mid = (start + end) /2 ;
        int [] first = mergeSort(arr, start, mid);
        int [] second = mergeSort(arr, mid+1, end);

        int [] mix = mergeSort(first, second);
        return mix;
    }

    private static int[] mergeSort(int[] first, int[] second) {
        int [] merged = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ( i < first.length && j < second.length){
            if (first[i] < second[j]){
                merged[k] = first[i];
                i++;
                k++;
            }
            else {
                merged[k] = second[j];
                j++;
                k++;
            }
            if(i == first.length){
                while (j < second.length){
                    merged[k] = second[j];
                    k++;
                    j++;
                }
            }
            if(j == second.length){
                while ( i < first.length){
                    merged[k] = first[i];
                    i++;
                    k++;
                }
            }
        }
        return merged;
    }
}
