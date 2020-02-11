import java.util.Scanner;

public class Ques_2_m_On_Index {
    /* Take as input N, the size of array.
   Take N more inputs and store that in an array.
   Take as input a number M.Write a function which returns
   the index on which M is found in the array,
   in case M is not found -1 is returned. Print the value returned. */
   static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int m = s.nextInt();
        int index =IndexNum(arr,m);
        System.out.println(index);
    }

    private static int IndexNum(int[] arr, int m) {
        for (int i = 0; i < arr.length; i++) {
            if(m == arr[i]){
                return i;
            }
        }
        return -1;
    }

}
