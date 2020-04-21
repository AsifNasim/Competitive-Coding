import java.util.Arrays;
import java.util.Scanner;

public class lexicographical {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int [] ch  = frequency(str);
        int length = s.nextInt();
        permute("",ch, length);
//        System.out.println(Arrays.toString());
    }


    private static int[] frequency(String str){
        int [] freq = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        return freq;
    }

    private static void permute(String processed, int [] freq, int length){
        if(length == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 0){
                freq[i]--;
                permute(processed + (char)(i+'a'),freq, length-1);
                freq[i]++;
            }
        }
    }
}
