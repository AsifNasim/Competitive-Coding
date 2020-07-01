package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndices {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int data = s.nextInt();
      int [] ans = allIndices(arr, 0, data,0);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int [] allIndices(int[] arr, int sI, int data, int count ) {

        if(sI == arr.length){
            int [] base = new int[count];
            return base;
        }

       int [] indices = null;
       if(arr[sI] == data){
           indices = allIndices(arr, sI+1, data, count+1);
       }
       else{
           indices = allIndices(arr, sI+1, data, count);
       }

       if(arr[sI] == data){
           indices[count] = sI;
       }
       return indices;
    }
}
