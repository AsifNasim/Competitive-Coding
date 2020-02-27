import java.util.Scanner;

public class Ganeshas_Pattern {
    /*
     *     * * * *
     *     *
     *     *
     * * * * * * *
           *     *
           *     *
     * * * *     *
     */
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        int row =1;
        while(row <= n){
            int col = 1;
            while (col <= n){
                if(row ==1){
                    if(col == 1 || col > n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                if(row == n/2+1){
                    System.out.print("*");
                }

                if(row == n){
                    if(col <= n/2+1 || col ==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

                if(row > 1 && row <= n/2){
                    if(col ==1 || col == n/2+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                if(row > n/2+1 && row < n){
                    if(col == n/2+1 || col == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
