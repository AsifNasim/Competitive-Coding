import java.util.Scanner;

public class Ques_7_numTriPattern {
    /* Pattern
        1
        2 3
        4 5 6
        7 8 9 10
                   */
    static Scanner s = new Scanner(System.in);
    public static void main(String [] args){
        int n = s.nextInt();
        int row =1;
        int value =1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                System.out.print(value+" ");
                value= value+ 1;
                col = col +1;
            }
            System.out.println();
            row = row +1;
        }
    }

}
