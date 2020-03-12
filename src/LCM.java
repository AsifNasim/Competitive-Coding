import java.util.Scanner;

public class LCM {
    public static long mod = 1000000000;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        long N1 = s.nextInt();
        long N2 = s.nextInt();

        long ans = lcmOfTwoNum(N1, N2);
        System.out.println(ans);
    }

    private static long lcmOfTwoNum(long n1, long n2) {
        long max = Math.max(n1,n2);
        long lcm = -1;
        while (max <= mod ){
            if((max%n1 == 0) && (max%n2 == 0)){
                lcm = max;
                break;
            }
            max++;
        }
        return  lcm;
    }
}
