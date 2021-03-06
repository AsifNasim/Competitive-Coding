import java.util.Scanner;

public class OddEvenBackInDelhi {
    /*Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even
    Rule in Delhi. The scheme is as follows, each car will be allowed to run on
    Sunday if the sum of digits which are even is divisible by 4 or sum of digits
    which are odd in that number is divisible by 3. However to check every car for
    the above criteria can't be done by the Delhi Police. You need to help Delhi
    Police by finding out if a car numbered N will be allowed to run on Sunday?*/
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();
        for(int i =0; i< t; i++){
            int num = s.nextInt();

            int evenSum =0;
            int oddSum = 0;
            while(num > 0){
                int lastDigit = num%10;
                if(lastDigit%2 == 0) {
                    evenSum += lastDigit;
                }
                else{
                    oddSum += lastDigit;
                }
                num /= 10;
            }

            if(evenSum%4 == 0 || oddSum%3 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
