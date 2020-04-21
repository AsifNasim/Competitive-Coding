import java.util.Scanner;

public class LCS {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static int LCSDPsol(String s1, String s2){
        if(s1.length() == 0 || s2.length() == 0){
                return 0;
            }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if(f == s){
            return 1+ LCSDPsol(s1.substring(1), s2.substring(1));
        }

        else{
            return  Math.max(LCSDPsol(s1.substring(1),s2), LCSDPsol(s1, s2.substring(1)));
        }

    }


}
