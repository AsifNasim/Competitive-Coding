import java.util.Scanner;

public class ArrayRec {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int elem = s.nextInt();
        int index =  linearSearch(arr,elem);
        System.out.println(index);
    }
    private static int linearSearch(int []arr, int elem, int sI, int eI){
        if(arr[sI] == elem){
            return sI;
        }
        return linearSearch(arr,elem, sI+1, eI);
    }
    private static int linearSearch(int []arr, int elem){


        return linearSearch(arr, elem, 0, arr.length);
    }


}
