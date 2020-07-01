package Test1;

import java.util.Scanner;

public class CheckSequence {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String str1 = s.next();
        String str2 = s.next();
        System.out.println(checkSequence(str1,str2));
    }

    private static boolean checkSequence(String str1, String str2) {
        if(str1.isEmpty()){
            return false;
        }

        if(str2.isEmpty()){
            return true;
        }

        if(str1.charAt(0) == str2.charAt(0)){
            boolean smallAns = checkSequence(str1.substring(1), str2.substring(1));
            return smallAns;
        }

        else{
            boolean smallAns = checkSequence(str1.substring(1), str2);
            return smallAns;
        }
    }
}
