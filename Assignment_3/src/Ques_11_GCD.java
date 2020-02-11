import java.util.Scanner;

public class Ques_11_GCD {
    /*GCD of two numbers*/
    static Scanner s = new Scanner(System.in);
    private static int maxNum(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    private static int gcdOfTwoNos(int num1, int num2){
        int GCD = -1;
        int i =2;
        while ( i < maxNum(num1, num2)){
            if(num1%i ==0 && num2%i == 0){
                GCD = i;
            }
            i = i+1;
        }
        return GCD;
    }

    public static void main(String[] args) {
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcdResult = gcdOfTwoNos(n1, n2);
        System.out.println(gcdResult);
    }
}
