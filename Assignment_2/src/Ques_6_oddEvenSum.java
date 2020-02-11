import java.util.Scanner;

public class Ques_6_oddEvenSum {
    /*Odd-Even Sum*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int evenSum = 0;
        int oddSum =0;
        int size = s.nextInt();
        int [] arr = new int[size];
        for(int i =0; i< size; i++){
            arr[i] = s.nextInt();
        }
        for(int i =0; i<size;i++){
            if(i%2 ==0 ){
                oddSum += arr[i];
            }
            else{
                evenSum += arr[i];
            }
        }
        System.out.println("OddSum = "+ oddSum);
        System.out.println("EvenSum = " + evenSum);
    }
}
