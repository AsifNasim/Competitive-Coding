import java.util.Scanner;


public class Ques_9_selectionSort {
    /*Take as input N, the size of array. Take N more inputs and store that in an array.
    Write a function that selection sorts the array. Print the elements of sorted array*/
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int [] input = takeInput();
        selectionSort(input);
        display(input);
    }

    private static void display(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void selectionSort(int [] arr) {
        for (int counter = 0; counter <arr.length -1 ; counter++) {
            int min = counter;
            for (int j = counter +1; j <= arr.length -1; j++) {
                if(arr[j] <arr[min]){
                   min = j;
                }
                swap(arr, min,counter );
            }
        }
    }

    private static void swap(int[] arr, int counter, int j) {
        int temp = arr[counter];
        arr[counter] = arr[j];
        arr[j] = temp;
    }

    private static int[] takeInput() {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
