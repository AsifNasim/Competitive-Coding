import java.util.Scanner;

public class Patternrevrse {

        static Scanner s = new Scanner(System.in);
        public static void main(String[] args) {
            int n = s.nextInt();
            int row =n;
            while(row >= 1){
                int val = 1;
                int col =1;
                while(col >= row){
                    System.out.print(val);
                    val++;
                    col--;
                }
                row--;
                System.out.println();
            }
        }


}
