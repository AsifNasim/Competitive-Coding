import java.util.Scanner;

public class DecToBin {
    static Scanner s = new Scanner(System.in);

    private static int decToBin(int n){
        int binary = 0;
        int place =1;
        while (n > 0){
             int lastDigit = n%2;
            binary = binary + lastDigit*place ;
            n = n/2;
            place = place *10;
        }
        return binary;
    }
    public static void main(String[] args) {
        int n = s.nextInt();
        int result = decToBin(n);
        System.out.println(result);
    }
}
