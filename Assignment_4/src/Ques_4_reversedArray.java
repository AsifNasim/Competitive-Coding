import java.util.Scanner;

public class Ques_4_reversedArray {
    /*Take as input N, the size of array.
      Take N more inputs and store that in an array.
      Write a function that reverses the array. Print the values in reversed array. */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        reversedArray(arr);

    }

    private static void reversedArray(int[] arr) {

        for (int i = arr.length - 1; i >=  0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
