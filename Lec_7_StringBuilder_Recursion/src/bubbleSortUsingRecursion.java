import java.util.Scanner;

public class bubbleSortUsingRecursion {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        bubbleSort(arr,0,arr.length-1);
        display(arr);
    }

    private static void bubbleSort(int[] arr, int sI, int eI) {
        if(sI == eI){
            return ;
        }
        if(arr[sI]>arr[sI+1]){
            int temp = arr[sI];
            arr[sI] = arr[sI + 1];
            arr[sI+1] = temp;
        }
        bubbleSort(arr, sI + 1, eI-1);
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
