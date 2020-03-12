import java.util.Scanner;

public class MultiplicationRec {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int m = s.nextInt();
        int n = s.nextInt();
        int ans = mul(m,n);
        System.out.println(ans);
    }

    private static int mul(int m, int n) {
        if(n == 0){
            return 0;
        }
        // both method for base res are fine to implement
//        if(n == 1){
//            return m;
//        }
        int smallAns = mul(m, n-1);
        return m + smallAns;
    }
}
