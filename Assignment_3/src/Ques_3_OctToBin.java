import java.util.Scanner;

public class Ques_3_OctToBin {
    private static int octToDec(int n ){
        int decimal = 0;
        int place = 1;
        while ( n > 0){
            int lastDigit = n%10;
            decimal += lastDigit*place;
            place *= 8;
            n /= 10;
        }
        return decimal;
    }
    private static int decToBin(int n){
        int binary =0;
        int place = 1;
        while ( n > 0){
            int lastDigit = n%2;
            binary += lastDigit*place;
            place *= 10;
            n /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int decResult = octToDec(n);
        int binResult = decToBin(decResult);
        System.out.println(binResult);
    }
}
