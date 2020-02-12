import java.util.Scanner;

public class Ques_1_OddEvenRecursion {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        OddEvenRecursion(n);
    }

    private static void OddEvenRecursion(int n) {
        if(n == 0){
            return ;
        }
        if(n%2 != 0) {
            System.out.println(n);
        }
        OddEvenRecursion(n-1);
        if(n%2 ==0){
            System.out.println(n);
        }

    }
}
