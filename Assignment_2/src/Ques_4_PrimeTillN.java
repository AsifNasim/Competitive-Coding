import java.util.Scanner;

public class Ques_4_PrimeTillN {
    /*Prime numbers from 2 to N*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int i =2;
        while (i <= n){
            boolean isPrime = true;
            int d = 2;
            while (d <i){
                if(i%d == 0){
                    isPrime = false;
                    break;
                }
                d = d+1;
            }
            if(isPrime){
                System.out.print(i+" ");
            }
            i= i+1;
        }

    }
}
