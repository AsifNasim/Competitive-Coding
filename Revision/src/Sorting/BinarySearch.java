package Sorting;

import java.util.Scanner;

public class BinarySearch {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int elem = s.nextInt();
        System.out.println(binarySearch(arr,elem));

    }
    private static int binarySearch(int [] arr, int elem){
        int start = 0;
        int end = arr.length-1;


        while (start <= end ){
            int mid = (start+ end)/2;
            if(elem == arr[mid]){
                return mid;
            }

            if(elem < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
