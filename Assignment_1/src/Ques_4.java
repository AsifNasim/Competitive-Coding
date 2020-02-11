import java.util.Scanner;
/* Titanic crew*/
public class Ques_4 {
    static Scanner s= new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Take user Input");
        long input = s.nextInt();
        int x = 1;
        while((int)Math.pow(2,x) <= input){
            x = x+1;
        }
        long result = (int)Math.pow(2,x-1);
        System.out.println("The man should stand at "+result+"th position.");
    }
}
