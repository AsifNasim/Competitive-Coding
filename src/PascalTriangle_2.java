import java.util.Scanner;

public class PascalTriangle_2 {
    /*1
    * 1 1
    * 1 2 1
    * 1 3 3 1
    * 1 4 6 4 1
    * 1 5 10 5 1*/
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int n = s.nextInt();
        int row =0;
        while(row < n){
            int col = 0;
            while(col <= row){
                int ans = nCr(row,col);
                System.out.print(ans+" ");
                col++;
            }
            System.out.println();
            row++;
        }

    }


    private static int nCr(int n, int r){
        int num = factorial(n);
        int deno = factorial(n-r)*factorial(r);
        int result = num/deno;
        return result;
    }

    private static int factorial(int n) {
        int fact = 1;
        while (n> 0){
            fact = fact*n;
            n--;
        }
        return fact;
    }

}
