import java.util.Scanner;

public class aRRAYrOUGH {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for(int num:arr){ // Enhanced for loop
            System.out.print(num+" ");
        }
    }
}
