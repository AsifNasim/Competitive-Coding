import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(secondLargest(arr));

    }

    private static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        int largest  = arr[arr.length-1];
        for (int i = arr.length-2 ; i > 0 ; i--) {
            if(arr[i]< largest){
                return arr[i];
            }
        }
        return -1;
    }
}
