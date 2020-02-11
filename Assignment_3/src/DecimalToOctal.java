import java.util.Scanner;

public class DecimalToOctal {
    static Scanner s = new Scanner(System.in);
    private static int decToOct(int n){
        int Octal = 0;
        int place =1;
        while (n > 0){
            int lastDigit = n%8;
            Octal += lastDigit*place;
            place *= 10;
            n /= 8;
        }
        return Octal;
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int result = decToOct(n);
        System.out.print(result);
    }
}
