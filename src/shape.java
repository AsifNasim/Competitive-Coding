import java.util.Scanner;
public class shape {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        int n = s.nextInt();
        int row = 1;
        int k = 1;
        while(k <= 2*n -1){
            int col = 1;
            while(col <= row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            if(k <n){
                row = row+1;
            }
            else{
                row = row -1;
            }
            k = k+1;
        }
    }
}