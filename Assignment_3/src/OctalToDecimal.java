import java.util.Scanner;

public class OctalToDecimal {
    private static int octToDec(int n ){
        int decimal = 0;
        int place = 1;
        while (n > 0){
            int lastDigit = n%10;
            decimal += lastDigit*place;
            place *= 8;
            n /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = octToDec(n);
        System.out.println(result);
    }
}
