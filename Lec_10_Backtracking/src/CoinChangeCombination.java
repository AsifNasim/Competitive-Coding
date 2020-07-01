import java.util.Scanner;

public class CoinChangeCombination {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int [] denom = new int[size];
        for (int i = 0; i < denom.length; i++) {
            denom[i] = s.nextInt();
        }
        coinChangeCombination(denom,10,"",0);
    }

    private static void coinChangeCombination(int[] denom, int amount, String ans, int lastDenomIdx) {
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        for (int i = lastDenomIdx; i <denom.length ; i++) {
            if (amount >= denom[i]){
                coinChangeCombination(denom, amount - denom[i], ans+denom[i], i);
            }

        }
    }
    private static void coinChangeCombinationPermutation(int[] denom, int amount, String ans) {
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i <denom.length ; i++) {
            if (amount >= denom[i]){
                coinChangeCombinationPermutation(denom, amount - denom[i], ans+denom[i]);
            }

        }

        // negative basecase
        if(amount < 0){
            return;
        }
        // alternative
        for (int i = 0; i <denom.length ; i++) {

                coinChangeCombinationPermutation(denom, amount - denom[i], ans+denom[i]);

        }
    }

}
