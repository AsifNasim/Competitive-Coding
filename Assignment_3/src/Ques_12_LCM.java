import java.util.Scanner;

public class Ques_12_LCM {
    /*LCM of two numbers*/
    static Scanner s = new Scanner(System.in);
    private static int LCM(int n1, int n2){

        int i = 0;
        if(n1 < n2){
            i = n1;
        }
        else{
            i = n2;
        }
        int LCM = -1;
        while ( i < 1000){
            if(n1%i ==0 && n2%i == 0){
                LCM = i;
            }
            i++;
        }
        return LCM;
    }

    public static void main(String[] args) {
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int result = LCM(num1,num2);
        System.out.println(result);
    }
}
