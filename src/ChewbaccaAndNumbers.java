import java.util.Scanner;

public class ChewbaccaAndNumbers {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int ans = Chewbacca(n);
        System.out.println(ans);

    }
    private static int Chewbacca(int n){
        int ans = count(n);
        int x = n;
        int num =0;
        while(ans > 0){
            int digit = x/(int)Math.pow(10,ans-1);
            if(digit>4){
                digit = 9 -digit;
                num = num*10 + digit;

            }
            else{
                num = num*10 + digit;

            }
            x = x%(int)Math.pow(10,ans-1);
            ans--;
        }
        if(num == 0 || count(num)<count(n) ){
            return n;
        }
        else{
            return num;
        }
    }

    private static int count(int n){
        int cnt = 0;
        while(n > 0){
            int lastDigit = n%10;
            cnt++;
            n /= 10;
        }
        return cnt;
    }
}
