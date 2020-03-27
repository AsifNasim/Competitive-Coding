import java.util.Scanner;

public class CheckAB {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ans = check(s.next());
        System.out.println(ans);
    }

    private static boolean check(String input) {
        if(input.isEmpty()){
            return true;
        }

        boolean smallAns = check(input.substring(1));
        if(input.charAt(0) == 'a' && (input.charAt(1) == ' ' || input.charAt(1) == 'a'
        || input.substring(1).equals("bb"))){
            return true;
        }
        else{
            return false;
        }
    }
}
