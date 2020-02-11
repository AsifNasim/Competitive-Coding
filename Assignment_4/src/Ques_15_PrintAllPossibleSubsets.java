import java.util.Scanner;

public class Ques_15_PrintAllPossibleSubsets {
    /* Take as input N, the size of array. Take N more inputs and store that in an array.
    Print all possible subsets of the array E.g. for [1, 2, 3] the following subsets are
    possible
    []
    [1]
    [2]
    [3]
    [1, 2]
    [1, 3]
    [2, 3]
    [1, 2, 3] */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
//        int [] allsubsets = Subsets(arr);
//        for (int i = 0; i < allsubsets.length; i++) {
//            System.out.println(allsubsets[i]+" ");
//
//        }
    }

//    private static int[] Subsets(int[] arr) {
//
//    }
}
