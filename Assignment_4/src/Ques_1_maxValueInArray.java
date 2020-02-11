import java.util.Scanner;
public class Ques_1_maxValueInArray {
    /*  Take as input N, the size of array.
        Take N more inputs and store that in an array.
        Write a function which returns the maximum value in the array.
        Print the value returned. */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int Max = maxValue(arr);
        System.out.println(Max);
    }

    private static int maxValue(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
}
