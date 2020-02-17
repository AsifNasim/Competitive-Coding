import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        quickSort(arr,0, arr.length);
//        int ans = pivotChange(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));


    }

    private static void quickSort(int[] arr, int start, int end) {
        if(end<= start){
            return;
        }
        int pivot = end -1;
        pivot = pivotChange(arr, start,pivot);
        quickSort(arr, start, pivot);
        quickSort(arr, pivot+1, end);
    }

    private static int pivotChange(int[] arr, int start, int pivot ) {
        int j = start;
        for (int i = start; i < pivot; i++) {
            if(arr[i]< pivot){
                swap(arr, i,j);
                j++;
            }
        }
        swap(arr, pivot,j);
        return j;
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
