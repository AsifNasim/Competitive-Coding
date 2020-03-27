import java.math.BigInteger;
import java.util.Scanner;


public class ModularExponentiation {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        BigInteger ans = Exponent(a,b,c);
        System.out.println(ans);
    }

    private static BigInteger Exponent(int a , int b, int c){
        if(b == 0){
            return BigInteger.valueOf(1);
        }
        else if(b == 1){
            return BigInteger.valueOf(a);
        }
        else{
            BigInteger r = Exponent(a,b/2,c);
            if(b%2 == 0){
                return (r.multiply(r)).mod(BigInteger.valueOf(c));
//                return ans;
            }
            else{
//                return (r*a*r)%c;
                return ((r.multiply(r)).multiply(BigInteger.valueOf(a).mod(BigInteger.valueOf(c))));
//                return ans;
            }
        }


    }

}
