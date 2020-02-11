import java.util.Arrays;
import java.util.Scanner;

public class Sorting_home {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int [] arr = takeInput();
//        int n = s.nextInt();
//    int ans =binarySquareroot(n);
//        System.out.println(ans);
//        int result = maxIndex(arr);
//        selectionSort(arr);
        insertionSort(arr);
//        arrayDisplay(arr);
//        System.out.println(result);
//        bubbleSort(arr);
//        selectionSort(arr);
        arrayDisplay(arr);

    }
    public static int binarySquareroot(int n){
        int start = 1;
        int end = n;
        int ans = 0;
        while (start <= end){
            int mid =(start + end)/2;
//            int ans =0;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                end = mid-1;
            }
            else{
                ans = mid;
                start = mid+1;

            }

        }
        return ans;
    }

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void arrayDisplay(int [] arr){
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
    }
    public static void arrayDisplayBetter(int [] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void bubbleSort(int [] arr){
        for (int i = 0; i <arr.length -1 ; i++) {
            for (int j = 0; j <arr.length-1- i ; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
//                    Util.swap(arr,j,j+1);
                    /*conventional process of swapping*/
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int maxInd = maxIndexBetter(arr, 0,arr.length-i-1);
                swap(arr,maxInd,arr.length-i-1);
        }
    }
    public static void insertionSort(int [] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j]< arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }

        }
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int maxIndex(int [] arr){
        int max = 0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
            return max;
        }
        return -1;
    }
    public static int maxIndexBetter(int [] arr,int start, int end){

        int max = start;
        for (int i = start; i <= end  ; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
