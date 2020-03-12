import java.util.Scanner;

public class replacePI {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String ans = replacePi(s.next());
        System.out.println(ans);
    }

    private static String replacePi(String input) {
        String out = "";
        if(input.length() == 0){
            return input;
        }

        String smallAns = replacePi(input.substring(1));
        if(input.charAt(0) == 'p' && smallAns.charAt(0) == 'i'){
//            out = "3.14" + replacePi(input.substring(2));
            //or
            out = "3.14" + smallAns.substring(1);
        }
        else {
            out = input.charAt(0) + smallAns;
        }
        return out;
    }
}
