import java.util.Scanner;

public class Fibo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        Integer [] arr =new Integer[n+1];
        System.out.println(fibo(n));
        System.out.println(fibDP(n, arr));
        System.out.println(fibITR(n, arr));

    }

    public static int fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static int fibDP(int n, Integer [] mem){
        if(n < 2){
            return n;
        }
        if(mem[n]!= null){
            return mem[n];

        }
        mem[n] = fibDP(n-1, mem) + fibDP(n-2, mem);
        return mem[n];

//            return fibDP(n-1, mem) + fibDP(n-2, mem);

    }

    public static int fibITR(int n, Integer[] arr ){
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }


}

