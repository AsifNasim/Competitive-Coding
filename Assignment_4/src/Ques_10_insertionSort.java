import java.util.Scanner;

public class Ques_10_insertionSort {
    /* Take as input N, the size of array. Take N more inputs and store that in an array.
     Write a function that insertion sorts the array. Print the elements of sorted array. */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
     int [] input = takeInput();
     insertionSort(input);
     display(input);
    }

    private static void display(int[] input) {
        for(int i =0; i< input.length; i++){
            System.out.print(input[i]+" ");
        }
    }

    private static void insertionSort(int[] input) {
        for (int j = 2; j <=input.length-1 ; j++) {
            int key = input[j];
            int i = j-1;
            while ( i> 0 && input[i]>key ){
                input[i+1]= input[i];
                i--;
            }
            input[i+1] = key;
        }
    }

    private static int[] takeInput() {
        int size = s.nextInt();
        int [] arr = new int[size];
        for(int i =0; i< arr.length; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

}
