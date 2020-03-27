import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ReturnSubsequence {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();
        for (int i = 0; i <t; i++) {
            ArrayList<String> result = subsequence(s.next());
//            Collections.sort(result);
            for(String val: result){
                System.out.print(val+" ");
            }
        }


    }
    
    private static ArrayList<String> subsequence(String str){
        if(str.isEmpty()){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = subsequence(ros);
        for (String val: recResult) {

            myResult.add(ch+val);
            myResult.add((int)ch + val);
            myResult.add(val);



        }
        return myResult;
    }

//    public static ArrayList<String> subsequence(String input){
//        if(input.isEmpty()){
//            ArrayList<String> br = new ArrayList<>();
//            br.add("");
//            return br;
//        }
//
//        ArrayList<String> recResult = subsequence(input.substring(1));
////        String [] ans = new String[2*smallAns.length];
//        ArrayList<String> myResult = new ArrayList<>();
//        int k = 0;
//        for (int i = 0; i < recResult.length; i++) {
//           myResult.add(recResult.get(i));
//        }
//
//        for (int i = 0; i < smallAns.length; i++) {
//            ans[k] = input.charAt(0) + smallAns[i];
//            k++;
//        }
//        return ans;
//    }
}
