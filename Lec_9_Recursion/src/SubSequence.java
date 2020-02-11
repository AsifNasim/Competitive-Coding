import java.util.Scanner;

public class SubSequence {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String processed = "";
        String unprocessed = "abc";
        Subsequence(processed, unprocessed);

    }

    private static void Subsequence(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        Subsequence(processed + ch, unprocessed);
        Subsequence(processed, unprocessed);
    }
}
