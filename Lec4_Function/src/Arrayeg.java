import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayeg {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
//        int [] arr = new int[5];
//        for(int i =0; i< arr.length; i++){
//            System.out.println(Arrays.toString(arr)); // to print in String format used
//                    used incompetitive programming,
//         used to print to whole array individually
//        }
//        for(int i =0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        /*array is an object*/
//        for (int i =0; i<arr.length; i++){
//            arr[i] = s.nextInt(); // taking inputs
//        }

        int arr1 [] = new int[n];
        for(int i = 0; i< arr1.length; i++){
            arr1[i] = s.nextInt();
        }

        for (int j =0; j < arr1.length; j++){
            System.out.print(arr1[j]+" ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));
    }
}
