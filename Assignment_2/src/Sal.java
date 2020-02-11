import java.util.Scanner;

public class Sal {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int sal = s.nextInt();
        if(sal > 50000){
            sal += 300;
        }
        else {
            sal  += 200;
        }
        System.out.print(sal);
    }
}
