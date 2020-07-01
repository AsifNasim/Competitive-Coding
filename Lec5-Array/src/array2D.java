import java.util.Scanner;
public class array2D {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Enter the number of rows");
        int rows = s.nextInt();
        int [][] arr = new int[rows][];
        for(int i = 0; i< rows; i++){
            System.out.println(" enter the col of"+i+"th row");
            int cols = s.nextInt();
            arr[i] = new int[cols];
            for(int j =0; j < cols; j++){
                System.out.println("Enter the element");
                arr[i][j] = s.nextInt();
            }
        }
        display(arr);
    }

    public static void display(int [][] arr){
        for(int i =0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}