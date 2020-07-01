package StringAndTwoDArray;

import java.util.Scanner;

public class AllSubstring {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        allSubstring(str);
    }

    private static void allSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
