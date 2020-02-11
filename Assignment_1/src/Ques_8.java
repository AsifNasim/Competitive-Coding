import java.util.Scanner;

public class Ques_8 {
    /*all fibonacci less than input*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int input = s.nextInt();
        long f1 =0;
        long f2 = 1;
        long f3 = 0;
        System.out.print("0 ");
        while (f3 < input) {
            f3 = f1+ f2;
            f1 = f2;
            f2 =f3;
            System.out.print(f1 +" ");
        }

    }
}
