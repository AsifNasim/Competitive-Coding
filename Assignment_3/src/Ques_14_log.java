import java.util.Scanner;

public class Ques_14_log {
    /*Given two numbers base:n and x find the log of it*/
    static Scanner s = new Scanner(System.in);
    private static void log(int n, int x ){
        int ans = 0;

        if(n==1 && x == 1){
             ans =0;
            System.out.println(ans);
        }
        else  if(n ==0 && x == 0){
            ans = -1;
            System.out.println(ans);
        }
        else if(x == n){
             ans += 1;
            System.out.println(ans);
        }
        else if(x%n == 0){
            int count = 0;
            while ( x > 1){
                x = x/n;
                count++;
            }
            System.out.println(count);
        }

    }


    public static void main(String[] args) {
        int n = s.nextInt();
        int x = s.nextInt();

        log(n,x);
    }
}
