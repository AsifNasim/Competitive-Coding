
import java.util.Scanner;

public class Ques_8_bubbleSort  {
    /*
  Take as input N, the size of array. Take N more inputs and store that in an array.
  Write a function that bubble sorts the array.
  Print the elements of sorted array.  */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt();
        }
        bubbleSort(arr);
        display(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i <arr.length -1 ; i++) {
            for (int j = 0; j <arr.length -i -1; j++) {
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }

    private static void display(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
