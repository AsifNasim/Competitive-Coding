import java.util.Scanner;

public class Ques_16_IntegralSqrt {
    static Scanner s = new Scanner(System.in);
    private static int integralSqrt(int n){
        int result = (int)Math.sqrt(n);
        return result;
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int ans = integralSqrt(n);
        System.out.println(ans);
    }
}
