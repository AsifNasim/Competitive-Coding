import java.util.Scanner;

public class Ques_18_definingCase {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.next();
        char ch = str.charAt(0);
        char ans =  definingCase(ch);
        System.out.println(ans);

    }
    private static char definingCase(char chr){
        int ch = (int)chr;
        char ans;
        if(ch >= 65 && ch <= 90){
            ans = 'U';
        }
        else if(ch >= 97 && ch <= 122){
            ans = 'L';
        }
        else{
            ans = 'I';
        }
        return ans;
    }


}
