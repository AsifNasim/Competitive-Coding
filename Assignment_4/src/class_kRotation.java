import java.util.Scanner;

public class class_kRotation {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();

        kRotation(arr, k);
        display(arr);

    }

    private static void display(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void kRotation(int[] arr, int k) {
        reverse(arr,0,k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
//        for (int i = k+1; i <arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//         int left = 0;
//         int kth = k;
//        for (int i = left; i <=kth; i++) {
//            System.out.print(arr[i]+" ");
//        }
    }

    private static void reverse(int [] arr, int start, int end) {
        while (start <= end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
//            arr[start] ^= arr[end];
//            arr[end] ^= arr[start];
//            arr[start] ^= arr[end];
            start++;
            end--;
        }
    }


}
