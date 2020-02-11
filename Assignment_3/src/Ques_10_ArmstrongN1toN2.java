import java.util.Scanner;

public class Ques_10_ArmstrongN1toN2 {
    static Scanner s = new Scanner(System.in);

    private static void armStrongN1toN2(int n1, int n2) {
        while (n1 < n2) {
            int count = 0;
            int y = n1;
            int x = n1;
            while (x % 10 > 0) {
                count = count + 1;
                x = x / 10;
            }
            int sum = 0;
            while (y > 0) {
                int lastDigit = y % 10;
                int prod = 1;
                int i = count;
                while (i > 0) {
                    prod *= lastDigit;
                    i--;
                }
                y = y / 10;
                sum += prod;
            }
            if(sum == n1){
                System.out.print(sum+" ");
            }
            else{
                System.out.print("-1");
            }
            n1 = n1+1;
        }
    }



    public static void main(String[] args) {
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        armStrongN1toN2(n1,n2);

    }

}
