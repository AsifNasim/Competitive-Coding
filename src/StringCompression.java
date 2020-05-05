import java.util.ArrayList;
import java.util.Scanner;

public class StringCompression {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.next();
        compression(str);
    }

    private static void compression(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            int count =1;
            for (int j = i+1; j <str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            sb.append(str.charAt(i));
            sb.append(count);
            i += count-1;
        }
        System.out.println(sb);

    }
}
