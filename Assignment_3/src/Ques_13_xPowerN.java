import java.util.Scanner;

public class Ques_13_xPowerN {
    static Scanner s = new Scanner(System.in);
    private static int xPowerN(int n, int x){
        int i= x;
        int result = 1;
        while ( i > 0){
            result *= n;
            i--;
        }
        return result;
    }
    private static int xPowerNbetter(int n, int x){
        int result = (int)Math.pow(n,x);
        return result;
    }


    public static void main(String[] args) {
        int n = s.nextInt();
        int x = s.nextInt();
        int result = xPowerN(n,x);
        System.out.println(result);
    }
}
