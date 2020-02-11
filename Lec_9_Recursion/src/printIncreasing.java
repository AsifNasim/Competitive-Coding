import java.util.Scanner;

public class printIncreasing {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n =s.nextInt();
        printInc(n);
    }

    private static void printInc(int n) {

      if(n ==0){
          return;
        }

        printInc(n-1);
        System.out.println(n);
    }
}
