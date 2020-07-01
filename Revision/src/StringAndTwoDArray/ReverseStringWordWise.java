package StringAndTwoDArray;

import java.util.Scanner;

public class ReverseStringWordWise {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.println(reverseWordWise(str));
    }

    private static String reverseWordWise(String str) {
        String res ="";
        int i = str.length()-1;
        int wordEnd = str.length();
        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                res += str.substring(i + 1, wordEnd) + " ";
                wordEnd = i;
            }
            i--;
        }
            res += str.substring(i+1, wordEnd);
        return res;
        }

    }

