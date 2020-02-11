import java.util.Scanner;

public class Ques_1_isPalindrome {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        boolean isPal = isPalindrome(str);
        boolean ispalbetter = isPalindromeBetter(str);
        System.out.println(ispalbetter);
    }

    private static boolean isPalindromeBetter(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            return true;
        }
        return false;
    }
    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;
        while(start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
               return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
