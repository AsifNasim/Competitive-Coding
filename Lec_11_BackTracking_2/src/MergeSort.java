import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        mergeSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr)));
    }



    private static int [] mergeSort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int [] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);
    }

    public static int [] merge (int []first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
                k++;
            } else {
                mix[k] = second[j];
                j++;
                k++;
            }
        }
        while(i < first.length){
            mix[k] = second[j];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
