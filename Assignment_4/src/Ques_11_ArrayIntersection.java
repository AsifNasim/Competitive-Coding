import java.util.ArrayList;
import java.util.Scanner;

public class Ques_11_ArrayIntersection {
    /* Take as input N, the size of array. Take N more inputs and store that in an array.
     Take N more inputs and store that in another array.
     Write a function which returns the intersection of two arrays in an ArrayList of integers.
     Print the ArrayList returned.
     E.g. for the following arrays 1, 2, 3, 1, 2, 4, 1 and 2, 1, 3, 1, 5, 2, 2
     the output will be [1, 1, 2, 2, 3] */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size_1 = s.nextInt();
        int [] arr1 = new int[size_1];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = s.nextInt();
        }
        int size_2 = s.nextInt();
        int [] arr2 = new int[size_2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        ArrayList<Integer> ans = arrayIntersection(arr1, arr2);

        System.out.print(ans+" ");
    }

    private static ArrayList<Integer> arrayIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    list.add(arr1[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return (list);
    } 
}
