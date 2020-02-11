import java.util.Scanner;
/*Reverse of a number*/
public class Ques_2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        long input = s.nextInt();
        long reverseNumber = 0;
        while (input != 0) {
          long  lastDigit = input% 10;
            reverseNumber = reverseNumber* 10 + lastDigit;
            input = input/10;

        }
        System.out.print(reverseNumber);

    }
}
