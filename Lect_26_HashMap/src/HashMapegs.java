import java.util.HashMap;
import java.util.Scanner;

public class HashMapegs {
    static Scanner s = new Scanner(System.in);

    public static HashMap<Character, Integer> Frequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        String str = s.next();
        HashMap<Character, Integer> ans = Frequency(str);
        System.out.println(ans);
    }
}
