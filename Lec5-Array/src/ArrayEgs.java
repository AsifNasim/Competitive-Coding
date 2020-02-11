import java.util.Scanner;

public class ArrayEgs {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();

        int arr[] = new int[n];
        for (int i =0; i< arr.length; i++){
            arr[i]= s.nextInt();
        }
        int elem = s.nextInt();
        //        int ans =Sum(arr);
//        int ans = max(arr);
//        int ans = linearSearch(arr, elem);
        int ans = binarySearch(arr, elem);
        System.out.println(ans);


//        swap(arr);
//        for (int i =0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
    }



    public static void swap(int [] arr){
        int t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
    }

    private static int Sum(int [] arr){
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    private static int max(int [] arr){
        int maxNum = -1;
        for (int i =0; i< arr.length; i++){
            if(arr[i]> maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    private static int linearSearch(int [] arr, int i){


        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] == i ){
                return j;
            }
        }
        return -1;
    }
    // only for sorted data
    private static int binarySearch(int [] arr, int elem){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == elem){
                return mid;
            }
            else if(elem < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }

    private static void bubbleSort(int [] arr){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length -i-1; j++) {
                if (arr[j] > arr[i]) {
                    Util.swap(arr,i,j);
                }
            }

        }
    }
}
