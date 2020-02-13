import java.util.Scanner;

public class recursiveFirstIndex {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int data = s.nextInt();

        int ans = firstIndex(arr, 0, data);
        System.out.println(ans);
    }

    private static int firstIndex(int[] arr, int sI, int data) {
        if(sI == arr.length){
            return -1;
        }

        if(arr[sI] == data){
            return sI;
        }
        else{
            return firstIndex(arr, sI+1, data);
        }


    }
}
