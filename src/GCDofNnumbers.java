//import java.util.Scanner;
//
//public class GCDofNnumbers {
//    static Scanner s = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int size = s.nextInt();
//        int [] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//        }
//        int lr = largest(arr);
//        int i =1;
//        int gcd = -1;
//        while (i < lr){
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j]%i == 0){
//
//                }
//                gcd = i;
//            }
//            i++;
//        }
//        System.out.println(gcd);
//    }
//    private static int gCD(int [] arr, int large){
//        int gcd = -1;
//        int k =1;
//        while (k< large) {
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i]%k == 0){
//
//                }
//            }
//        }
//    }
//
//    private static int largest(int [] arr){
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]> max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//}
