package StringAndTwoDArray;

import java.util.Scanner;

public class CheckPalindrome {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.println(checkPal(str));
    }

    private static boolean checkPal(String str) {
        String res ="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            res += str.charAt(i);
        }

        if(str.equals(res)){
            return true;
        }
        else {
            return false;
        }
    }
}
