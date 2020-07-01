package Recursion;

import java.util.Scanner;

public class AllSubsequences {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        String unprocessed = s.next();
        allSubsequences("", unprocessed);
    }

    private static void allSubsequences(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        allSubsequences(processed+ch, unprocessed);
        allSubsequences(processed, unprocessed);

    }
}
