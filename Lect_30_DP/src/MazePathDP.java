import java.util.Scanner;

public class MazePathDP {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = 4;
        int col = 4;

    }

    public static int mazePath(int row, int col, int [][] mem){
        if(row == 1 || col == 1){
            return 1;
        }

        if(mem[row][col] != 0){
            return mem[row][col];
        }
        mem[row][col] = mazePath(row-1, col, mem)+ mazePath(row, col-1, mem);

        return mem[row][col];
    }

    public static int mazePathITR(int row, int col, int [][] mem){
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col ; j++) {
                if(i ==1 || j == 1){
                    mem[i][j] = 1;
                }
                else{
                    mem[i][j] = mem[i-1][j] + mem[i][j-1];
                }
            }
        }
        return mem[row][col];
    }
}
