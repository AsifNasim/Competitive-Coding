import java.util.Scanner;

public class GCDofNnumbers {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int ans = gCD(arr);
        System.out.println(ans);
    }
    private static int gCD(int [] arr){
       int ans = arr[0];
        for (int i =1; i < arr.length; i++) {
            ans = gcdOfTwoNos(ans, arr[i]);
        }
        return ans;
    }
    private static int gcdOfTwoNos(int num1, int num2){
        int GCD = -1;
        int i =1;
        while ( i < Math.max(num1, num2)){
            if(num1%i ==0 && num2%i == 0){
                GCD = i;
            }
            i = i+1;
        }
        return GCD;
    }
}
