import java.util.Scanner;

public class Ques_7_MirrorInverse {
    static Scanner s = new Scanner(System.in);
    private static int MirrorInverse(int n ){
        int place = 1;
        int reverse = 0;
//        int lastDigit = 1;
        while (n >0){
             int lastDigit = n%10;
            reverse += place*(int)Math.pow(10,lastDigit-1);
//            lastDigit++;
            place++;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int ans = MirrorInverse(n);
        System.out.println(ans);
    }
}
