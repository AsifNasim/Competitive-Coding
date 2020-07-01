package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class utils {
    static Scanner s = new Scanner(System.in);
    public static void display(int [] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
    public static void swap(int [] arr, int x, int y){
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y] = temp;
    }

    public static int [] takeInput(){
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }


} 
