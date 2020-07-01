package StringAndTwoDArray;

import java.util.Scanner;

public class CountWords {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.println(countWords(str));
    }

    private static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}
