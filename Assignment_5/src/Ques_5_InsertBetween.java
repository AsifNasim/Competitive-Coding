import java.util.Scanner;

public class Ques_5_InsertBetween {
    /* Take as input S, a string. Write a function that inserts between each pair of
    characters the difference between their ascii codes. Print the value returned*/
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();

        /*StringBuilder ans*/
        System.out.println(insertBetween(str));
//        System.out.println(ans);
    }

    private static String insertBetween(String str) {

        String ans ="";
        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i+1);
            ans += (char)ch+""+(ch1-ch);
        }
        ans += (char)str.charAt(str.length()-1);
        return ans;
    }

}
