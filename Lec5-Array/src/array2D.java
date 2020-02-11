import java.util.Scanner;

public class array2D {

    public static void main(String[] args) {
        int [][] arr2d = takeInput();
        display(arr2d);
    }
    static Scanner s = new Scanner(System.in);
    private static int [][] takeInput(){
        System.out.println("Enter the number of row: ");
        int row = s.nextInt();
        int [][] arr = new int[row][];
        for (int i = 0; i <row ; i++) {
            System.out.print("Enter the number of cols for row"+i);
            int col = s.nextInt();
            for (int j = 0; j <col ; j++) {
                System.out.print("Enter the values for "+i+"row and"+j+"column ");
                arr[i][j] = s.nextInt();
            }
            System.out.println();
        }
        return arr;
    }

    private static void display(int [][] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
