import java.util.Scanner;

public class  dice {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        String processed = "";
        int target = 4;
        die(processed ,target);
    }

    private static void die(String processed, int target) {
        if(target == 0){
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= target && i <= 6 ; i++) {
            die(processed +i, target - i);
        }
    }
}
