import java.util.Scanner;

public class Ques_10_fibPattern {
    /*   0
         1 1
         2 3 5
         8 13 21 34
                    */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int i =1;
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        while (i <= n){
            int j =1;
            while (j <= i){
                f3 = f1 +f2;
                f1 = f2;
                f2 = f3;
                if(i ==1){
                    System.out.print("0");
                    break;
                }
                else
                System.out.print(f2-f1+" ");
                j= j+1;
            }
            i = i+1;
            System.out.println();
        }
    }
}
