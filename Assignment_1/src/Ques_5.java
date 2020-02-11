import java.util.Scanner;

public class Ques_5 {
    /*Finding the coordinates*/
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int x = s.nextInt();
        int y = s.nextInt();
        int result = -1;
        if(x%2 ==0 && y%2==0){
            if(x!= 0)
            result = x+y;
        }
        else if((x%2 != 0 && y%2 ==0) || (x%2 ==0 && y%2 != 0)){
            System.out.println("Number not found");
        }
        else{
            result = (x+y) -1;
        }
        System.out.println(result);
    }
}
