import java.util.Scanner;

public class nThMagic {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
//        int ans = dectoBin(n);
//        int NthAns = magic(ans);
//        System.out.println(NthAns);
        int ans = bitwiseMagic(n);
        System.out.println(ans);
    }

    private static int dectoBin(int n ){
        int bin = 0;
        int place =1;
        while (n > 0){
            int lastDigit = n%2;
            bin += lastDigit*place;
            place*=10;
            n /= 2;
        }
        return bin;
    }
    public static int magic(int bin){
        int place =5;
        int nTh = 0;
        while (bin>0){
            int lastDigit = bin%10;
            nTh += lastDigit*place;
            place = place*5;
            bin /= 10;
        }
        return nTh;
    }

    private static int bitwiseMagic(int n){
        int ans = 0;
        int pow = 5;
        while (n > 0){
            if((n&1) == 1){
                ans += 1*pow;
            }
            else{
                ans += 0*pow;
            }
            n = n>>1;
            pow = pow*5;
        }
        return ans;
    }
}
