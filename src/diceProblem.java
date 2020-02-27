import java.util.Scanner;

public class diceProblem {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
    int target = s.nextInt();
    dice("",target);
    }

    private static void dice(String processed, int target) {
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= target && i <= 6; i++) {
            dice(processed+i, target-i);
        }
    }


}
