import java.util.Scanner;

public class Ques_1_checkPrime {
    /*Check Prime*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int input = s.nextInt();
        int i =2;
        while (i*i < input){
            if(input%i == 0){
                System.out.println("Not Prime");
                break;
            }
            else{
               i= i+1;
            }
            System.out.println("Prime");
        }

    }
}
