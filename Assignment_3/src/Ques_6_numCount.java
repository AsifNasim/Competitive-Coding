import java.util.Scanner;

public class Ques_6_numCount {
    static Scanner s = new Scanner(System.in);
    private static int countNum(long n, long i){
        int count = 0;
        while ( n >0){
            long lastDigit = n%10;
            if(lastDigit == i){
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        long n = s.nextInt();
        int i = s.nextInt();
        long result = countNum(n,i);
        System.out.println(result);
    }
}
