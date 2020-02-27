import java.util.Scanner;

public class IncredibleHulk {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();// no. of test cases
        for(int i =0; i< t; i++){
            int n = s.nextInt();
            int ans = incredibleHulk(n);
            System.out.println(ans);
        }
    }

    private static int incredibleHulk(int n) {
        int count = 0;
        while(n > 0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
