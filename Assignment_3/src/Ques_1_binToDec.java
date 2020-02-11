import java.util.Scanner;

public class Ques_1_binToDec {
    static Scanner s = new Scanner(System.in);
    private static int binToDec(int input){
        int bin =0;
        int place =1;
        while (input != 0){

            int lastDigit = input%10;
            bin += lastDigit*place;
            place *=2;
            input /= 10;
        }
        return bin;
    }

    private static void binToDecUsingMath(int input){
        int bin =0;
        int place =0;
        while (input != 0){

            int lastDigit = input%10;
            bin += lastDigit*(int) Math.pow(2,place);
            place++;
            input /= 10;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int result = binToDec(n);
        System.out.println(result);
        binToDecUsingMath(n);
    }
}
