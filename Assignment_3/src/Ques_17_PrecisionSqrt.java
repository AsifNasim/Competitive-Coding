import java.util.Scanner;

public class Ques_17_PrecisionSqrt {
    static Scanner s = new Scanner(System.in);
    private static void precisionSqrt(int n , int p){
        float result = (float)Math.sqrt(n);

        System.out.printf("%.4f",result);

    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int p = s.nextInt();
        precisionSqrt(n,p);
    }
}
