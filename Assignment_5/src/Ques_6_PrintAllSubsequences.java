import java.util.Scanner;

public class Ques_6_PrintAllSubsequences {
    /* Take as input S, a string. Write a function that prints all its subsequences. */
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str =s.nextLine();
      /*  String ans =*/ SubSequenceAnother(str);
//        System.out.println(ans);
    }

    private static void SubSequence(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));

            }
        }

    }
    private static void SubSequenceAnother(String str){
        for (int len = 1; len <= str.length(); len++) {
            for (int start = 0; start <= str.length() - len; start++) {
                int end = start+len;
                System.out.println(str.substring(start,end));
            }
        }
    }
}
