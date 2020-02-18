import java.util.*;
public class patternHollowRhombus {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        int n = s.nextInt();
        int row = 1;
        while(row <= n){
            int space = 1;
            while(space <= n- row){
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while(star <= n){
                if(row == 1 || row == n){
                    System.out.print("*");
                }
                else if((row > 1 || row < n) && (star>1 && star <n)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                star++;
            }
            row++;
            System.out.println();
        }
    }
}