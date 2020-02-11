import java.util.Scanner;

public class recursivePrint {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int ans_1 = fib(n);
        System.out.println(ans_1);
//        pdI(n);
//        System.out.println();
//        pdD(n);
//        System.out.println();
//        int ans  = factorial(n);
//        System.out.println(ans);
    }

    private static int fib(int n){
        if(n <2){
            return n;
        }
        return fib(n-2)+ fib(n-1);
    }

    private static int factorial(int n) {
        if(n ==1){
            return 1;
        }
        return n*factorial(n-1);
    }


    private static void pdD(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        pdD(n-1);
    }

    private static void pdI(int n ){
        if(n == 0){
            return;
        }
        pdI(n-1);
        System.out.print(n+" ");
    }


}
