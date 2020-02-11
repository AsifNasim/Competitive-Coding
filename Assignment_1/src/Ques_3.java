import java.util.Scanner;

public class Ques_3 {
    /*nth Fibonacci*/
    /*able to print output till 123*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int input = s.nextInt();
        long i =1;
        long f1 =0;
        long f2 = 1;
        long f3= 0;
        while (i <= input){
            f3 = f1+f2;
            f1 =f2;
            f2 =f3;
            i++;
        }
        
        System.out.println(f1);
    }
}
