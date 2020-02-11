import java.util.Scanner;

public class Ques_3_Reverse {
    /*Reverse of a Number*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int reverse =0;

        while(n != 0){
           int lastDigit = n%10;
            reverse = reverse*10 + lastDigit;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
