import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubSequence {
    static int count = 0;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        for(int i =0; i< n; i++){
            String processed = "";
            String unprocessed = s.next();
            ArrayList<String> ans =Subsequence(processed, unprocessed);
            System.out.println(ans);
//            System.out.print(count);
        }


    }

    private static ArrayList<String> Subsequence(String processed, String unprocessed) {
        ArrayList<String> list = new ArrayList<>();
        if(unprocessed.isEmpty()){
            count++;
//            System.out.println(processed);
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        Subsequence(processed + ch, unprocessed);
        Subsequence(processed, unprocessed);

        return list;
    }
}
