import java.util.Scanner;

public class UniqueNumber_I {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int ans = s.nextInt();
        for (int i = 0; i < n-1; i++) {
            ans = ans^s.nextInt();

        }
        System.out.println(ans);
//        int size = s.nextInt();
//        int [] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//        }
//        int ans = unique(arr);
//        System.out.println(ans);
    }
//    private static int unique(int[] arr) {
//        for (int i = 0; i <= arr.length; i= i+2) {
//            if((arr[i]^arr[i+1]) != 0){
//                return arr[i+1];
//            }
//        }
//        return -1;
//    }
}
