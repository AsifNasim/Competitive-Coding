import java.util.Scanner;

public class isSorted {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        boolean ans = checkSorted(arr);
        System.out.println(ans);
    }

    private static boolean checkSorted(int[] arr) {
        return checkSorted(arr, 0, arr.length-1);
    }

    private static boolean checkSorted(int[] arr, int sI, int eI) {
        if(sI == eI){
            return true;
        }
        boolean smallAns = checkSorted(arr,sI+1, eI);
        if(arr[sI]<arr[sI+1]){
            return smallAns;
        }
        else{
            return false;
        }
    }
}
