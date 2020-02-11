import java.util.Scanner;

public class CaseConversion {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        toggle(str);
    }

    private static void toggle(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <sb.length() ; i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)('a' +(ch - 'A'));

            }
            else if(ch >= 'a' && ch <= 'z'){
                ch = (char)('A' + (ch - 'a'));
            }
            sb.setCharAt(i,ch);

        }
        System.out.println(sb);
    }
}
