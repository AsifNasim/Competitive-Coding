import java.util.Scanner;

public class Permutation {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String processed = "";
        String unprocessed = "abc";
        subSeq(processed,unprocessed);
    }

    private static void subSeq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            subSeq(first+ch+second,unprocessed);

        }
    }

}
