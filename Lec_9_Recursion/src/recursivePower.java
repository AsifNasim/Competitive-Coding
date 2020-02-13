import java.util.Scanner;

public class recursivePower {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int x = s.nextInt();
        int n = s.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }

    private static int power(int x, int n) {
        if(n == 1){
            return x;
        }
        return x*power(x, n-1);
    }
}
