import java.util.Scanner;

public class nQueens {
    static int count =0;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        boolean [][] board = new boolean[n][n];
        nQueensProb(board,0);
        System.out.println(count);

    }

    private static void print(boolean [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void nQueensProb(boolean[][] board, int row) {
        if(row == board.length){
            count++;
            print(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col]= true;
                nQueensProb(board, row+1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

        int left = Math.min(row ,col);
        for (int i = 1; i <= left; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        int right = Math.min(row, board.length-col - 1);
        for (int i = 1; i <= right; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
