import java.util.Scanner;

public class QuickSortBetter {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        quickSort(arr, 0, arr.length);
        display(arr);


    }

    private static void quickSort(int[] arr, int sI, int eI) {
        if(sI >= eI){
            return;
        }

        int pivotPos = partition(arr, sI, eI);
        quickSort(arr, sI, pivotPos-1);
        quickSort(arr,pivotPos+1,eI);
    }

    private static int partition(int[] arr, int sI, int eI) {
        int count = 0;
        int pivotVal = arr[sI];
        for (int i = sI+1; i <= eI ; i++) {
            if(arr[i] <= pivotVal){
                count++;
            }
        }

        int pivotPos = sI+count;
        QuickSort.swap(arr,pivotPos,sI);
        int i = sI;
        int j = eI;
        while (i < pivotPos && j > pivotPos ){
            if(arr[i] <= pivotVal){
                i++;
//                QuickSort.swap(arr,arr[i], arr[pivotPos]);
            }
            else if(arr[j] > pivotVal){
                j--;
            }
            else{
                QuickSort.swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotPos;
    }

    private static void display(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
