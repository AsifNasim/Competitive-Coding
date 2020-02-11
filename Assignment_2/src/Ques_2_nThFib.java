import java.util.Scanner;

public class Ques_2_nThFib {
    /*Nth Fibonacci*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        int i =1;
        while (i <= n){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            i++;
        }
        System.out.println(f1);
    }
}
