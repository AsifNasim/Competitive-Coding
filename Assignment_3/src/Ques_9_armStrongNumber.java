import java.util.Scanner;

public class Ques_9_armStrongNumber {
   static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        boolean isItTrue= isArmstrongBetter(n);
        System.out.println(isItTrue);
    }

    private static boolean  isArmstrongBetter(int n){

        int count = 0;
        int y = n;
        int x = n;
        while (x%10 > 0){
            count = count +1;
            x = x/10;
        }
        int sum = 0;
        while(n > 0){
            int lastDigit = n%10;
            sum += (int)Math.pow(lastDigit,count);
            n = n/10;
        }
//        while ( y >0){
//            int lastDigit = y%10;
//            int prod = 1;
//            int i = count;
//            while ( i > 0){
//                prod *= lastDigit;
//                i--;
//            }
//            y = y/10;
//            sum += prod;
//        }
        if(sum == y){
            return true;
        }
        else{
            return false;
        }
    }





}
