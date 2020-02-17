import java.util.Arrays;
import java.util.Scanner;
public class MergeSort {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        // int [] arr1 = {1,2,3,4,5};
        // int [] arr2 = {6,7,8,9};
        // int [] ans = mergeTwoSortedArrays(arr1, arr2);
        int [] arr = {9,8,7,6,5,4,3,2,1};
        int [] ans = mergeSort(arr,0,arr.length-1);
        for(int val : ans){
            System.out.print(val+" ");
        }
        // for(int i =0; i< ans.length; i++){
        //     System.out.print(ans[i]+" ");
        // }
    }
    public static int [] mergeSort(int [] arr,int start, int end){

            if(start == end ){
                int [] br = new int[1];
                br[0] = arr[start];
                return br;
            }

            int mid = (start + end) / 2;
            int[] firstHalf = mergeSort(arr, start, mid);
            int[] secondHalf = mergeSort(arr, mid + 1, end);

            int[] finalMergedArray = mergeTwoSortedArrays(firstHalf, secondHalf);

            return finalMergedArray;

    }
    public static int [] mergeTwoSortedArrays(int [] arr1, int [] arr2){
        int [] merged = new int[arr1.length + arr2.length];
        int i =0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i]< arr2[j]){
                merged[k] = arr1[i];
                i++;
                k++;
            }
            else{
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i == arr1.length){ // first array is exhausted
            while(j < arr2.length){
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        if( j == arr2.length) { // second array is exhausted
            while(i < arr1.length){
                merged[k] = arr1[i];
                i++;
                k++;
            }
        }
        return merged;
    }
}