import java.util.Scanner;

public class decNumber {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        decRecursion(n);
    }

    private static void decRecursion(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        decRecursion(n - 1);
    }
}
