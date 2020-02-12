import java.util.Scanner;

public class PDISkip {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        pdiskip(n);
    }

    private static void pdiskip(int n) {
        if(n == 1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        pdiskip(n-2);
        System.out.println(n-1);
    }
}
