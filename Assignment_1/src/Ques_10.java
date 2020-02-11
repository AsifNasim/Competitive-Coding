import java.util.Scanner;

public class Ques_10 {
    /*GCD of two numbers*/
    static Scanner s = new Scanner(System.in);
    private static int maxNum(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else
            return num2;
    }
    public static void main(String [] args){
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int GCD = -1;
        int i =2;
        while(i < maxNum(num1,num2)){
            if(num1%i ==0 && num2%i ==0 ){
                GCD =i;
            }
            i++;
        }
        System.out.println(GCD);

//        if(num1 < num2){
//            if(num2%num1== 0){
//                System.out.println(num1);
//            }
//        }
//        else if(num1> num2){
//            if(num1%num2==0){
//                System.out.println(num2);
//            }
//        }
    }
}
