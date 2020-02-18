import java.util.Scanner;

public class Ques_20_SpiralAntiClock {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] arr = new int[row][col];
        for(int i =0; i< arr.length; i++){
            for(int j =0; j< arr[0].length; j++){
                arr[i][j] = s.nextInt();
            }
        }

        spiralAntiClock(arr);
    }

    private static void spiralAntiClock(int[][] arr) {
        int top = 0;
        int left = 0;
        int bottom = arr.length-1;
        int right =arr[0].length-1;
        while(top <= bottom && left <= right){
            for (int i = top; i <=bottom ; i++) {
                System.out.print(arr[i][left]+" ");
            }
            left++;

            for (int i = left; i <= right ; i++) {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for (int i = bottom; i >= top ; i--) {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            for (int i = right; i >= left ; i--) {
                System.out.print(arr[top][i]+" ");
            }
            top++;
        }
    }
}
