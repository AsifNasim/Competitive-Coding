package Sorting;

public class utils {

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
}
