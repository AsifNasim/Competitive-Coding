import java.util.Scanner;

public class ArrayMultiDimensional {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int row = s.nextInt();
        int col =s.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {

                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                    for (int j = arr.length; j >= 0 ; j--) {


                        System.out.println(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

