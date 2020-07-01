import java.util.Scanner;

public class Ques_12_PairSum {
    /* Take as input N, the size of array. Take N more inputs and store that in an array.
     Take as input “target”, a number. Write a function which prints all pairs of numbers
     which sum to target.E.g. For this array => 3, 1, 9, 7, 5, -1 and target of 8
     the output is -1 and 9, 1 and 7, 3 and 5 */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        pairSum(arr,target);
    }

    private static void pairSum(int[] arr, int target) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] + arr[j] == target && i != j ){

                    if(arr[i] < arr[j]){
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                    else{
                        System.out.println(arr[j]+" "+arr[i]);
                    }
                    break;
                }
//                System.out.println();
            }
        }
        System.out.println();
    }
}
