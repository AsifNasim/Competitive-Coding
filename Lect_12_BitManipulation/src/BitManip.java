import java.util.Scanner;

public class BitManip {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int ans = unique(arr);
        System.out.println(ans);
        bitSwappy(2,3);
        checkOddEven(24575);
    }

   private static void checkOddEven(int n){
        if((n&1)== 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
   }

   private static void bitSwappy(int a, int b){
        a ^= b;
        b ^= a;
        a ^= b;

       System.out.println(a+" "+b);
   }
   private static int unique(int [] arr){
       for (int i = 0; i < arr.length; i++) {
           if((arr[i]^arr[i+1])!= 0){
               return arr[i];
           }
       }
        return -1;
   }
}
