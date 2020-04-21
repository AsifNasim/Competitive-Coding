import java.util.Scanner;

public class diceProblem {
    static Scanner s = new Scanner(System.in);
    static int count =0;
    public static void main(String[] args) {
    int target = s.nextInt();
    dice("",target);
        System.out.println("Total number of expected outcome: "+ count);
    }

    private static void dice(String processed, int target) {
        if(target == 0){
            System.out.println(processed);
            count++;
            return;
        }

        for (int i = 1; i <= target && i <= 6; i++) {
            dice(processed+i, target-i);
        }
    }


}
