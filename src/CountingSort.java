import java.util.Scanner;

public class CountingSort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size+1];
        for (int i = 1; i <= size ; i++) {
            arr[i] = s.nextInt();
        }
        countSort(arr,size);
        display(arr,size);

    }
    private static void display(int [] arr, int size){
        for (int i = 0; i < size;  i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static int max(int [] arr, int size){
        int Max = arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i] >Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    public static void countSort(int [] arr, int size){
        int [] output = new int[size+1];
        int maxElem  =max(arr, size);

        int [] count = new int[maxElem+1];

        for (int i = 0; i <= maxElem ; i++) {
            count[i] = 0;
        }
        for (int i = 1; i <= size ; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= maxElem ; i++) {
            count[i] += count[i-1];
        }

        for (int i = size; i >= 1 ; i--) {
            output[count[arr[i]]] = arr[i];
            count[arr[i]] -= 1;
        }

        for (int i = 1; i <= size ; i++) {
            arr[i] = output[i];
        }
    }
}
