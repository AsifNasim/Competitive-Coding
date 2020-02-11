import java.util.Scanner;

public class ques_9_Pascal {
    static Scanner s = new Scanner(System.in);

    private static int nCr(int n, int r) {
        if(n == 0 && r == 0){
            return 1;
        }
        int nFact = 1;
        int i =1;
        while (i <= n){
            nFact = nFact*i;
        }

        int rFact = 1;
        int j =1;
        while (j <= r){
            rFact = rFact*j;
        }
        int result = nFact/((nFact-rFact)*rFact);
        return result;
    }

    public static void main(String[] args) {

        int n = s.nextInt();
        int i =0;
        while (i < n){
            int r = 0;
            while (r < i){
                int ans = nCr(i,r);
                System.out.print(ans+" ");
                r++;
            }
            i++;
            System.out.println();
        }
    }
}
