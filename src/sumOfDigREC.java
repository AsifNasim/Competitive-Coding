import java.util.Scanner;

public class sumOfDigREC {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int input = s.nextInt();
        int sum = recSum(input);
        System.out.println(sum);
    }

    private static int recSum(int input) {
        if(input == 0){
            return 0;
        }

        return input%10+ recSum(input/10);
    }
}
