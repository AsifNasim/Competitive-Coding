import java.util.Scanner;

public class SanketAndString {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int k = s.nextInt();
        String str = s.next();
        int ans = sanket(str,k);
        System.out.println(ans);
    }

    private static int sanket(String str, int k) {
        StringBuilder sb = new StringBuilder(str);
        int count = 1;
        while (k-- > 0){
            //for changes in the string
            for (int i = 0; i <= sb.length(); i++) {
                if(sb.charAt(i) != sb.charAt(i+1)){
                    sb.setCharAt((i+1),(char) (sb.charAt(i+1)-1));
                }
            }
        }
        // for counting the number of max substring
        for (int i = 0; i <= sb.length(); i++) {
            if(sb.charAt(i) == sb.charAt(i+1)){
                count++;
            }
        }
        return count;
    }

}
