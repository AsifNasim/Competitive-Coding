import java.util.Scanner;

public class class_sorted2DArraySearch {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = s.nextInt();
        int col = s.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int elem = s.nextInt();
//        boolean isPresent = ArraySearch(arr,elem);
    }

//    private static boolean ArraySearch(int[][] arr, int elem) {
//
//    }
}
