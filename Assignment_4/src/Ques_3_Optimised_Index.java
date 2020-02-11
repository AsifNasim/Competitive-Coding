import java.rmi.dgc.VMID;
import java.util.Scanner;

public class Ques_3_Optimised_Index {
    /*
Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input a number M.
Write a function which returns the index on which M is found in the array,
in case M is not found -1 is returned. Print the value returned.
You can assume that the array is sorted, but you’ve to optimize the finding process.
For an array of size 1024, you can make 10 comparisons at maximum. */
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int m = s.nextInt();
        int index =IndexNum(arr,m);
        System.out.println(index);
    }

    private static int IndexNum(int[] arr, int m) {
        int start = 0;
        int end = arr.length -1;

        for (int i = start; i < end; i++) {
            int mid = (start+end)/2;
            if(arr[mid] == m){
                return mid;
            }
            else if(m <arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }

        }
        return -1;
    }
}
