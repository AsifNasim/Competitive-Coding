import java.util.Scanner;

public class Ques_9 {
    /*All prime number from 2 to Input*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int input = s.nextInt();
        int i =2;
        while(i <= input){
            boolean isPrime = true;
            int j =2;
            while(j<i ){
                if(i%j ==0){
                    isPrime = false;
                    break;
                }
                j++;

            }

            if(isPrime) {
                System.out.print(i + " ");
            }
            i++;

        }


    }
}
