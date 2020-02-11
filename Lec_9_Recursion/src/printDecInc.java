import java.util.Scanner;

public class printDecInc {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
//        PdI(n);
        int ans = fib(n);
        System.out.println(ans);
    }

    private static void PdI(int n) {
        if(n == 0){
            return;
        }

        System.out.println(n);
        PdI(n-1);
        System.out.println(n);
    }
    private static int fib(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
