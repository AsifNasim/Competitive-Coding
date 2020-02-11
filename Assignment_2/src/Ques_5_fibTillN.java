import java.util.Scanner;

public class Ques_5_fibTillN {
    /*All the Fibonacci less than N*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;

        while (f3< n){
            f3 = f1 +f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f1+" ");

        }

    }
}
