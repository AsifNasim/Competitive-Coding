import java.util.Scanner;

public class DiceProblem {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int target = s.nextInt();
        int [] arr = new int[target+1];
        System.out.println(diceDPRec(target, arr));

    }

    public static int dice(int target, Integer[] arr){
        if(target == 0){
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= target && i <= 6 ; i++) {
            count += dice(target-1, arr);
        }
        return count;
    }

    public static int diceCount(int target, Integer [] arr){
        if(target == 0){
            return 1;

        }
        int cnt = 0;
        for (int i = 1; i <= target && i <= 6 ; i++) {
            cnt += diceCount(target -i, arr);
        }
        return cnt;
    }

    public static int diceDPRec(int target, int [] mem){
        if(target == 0){
            return 1;
        }
        if(mem[target] != 0){
            return mem[target];
        }
        int cnt = 0;
        for (int i = 1; i <= target && i <= 6 ; i++) {
            cnt += diceDPRec(target-i, mem);
        }
        mem[target] = cnt;
        return mem[target];
    }

}

