import java.util.Scanner;

public class Ques_4_everyEvenOddChar {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        everyEvenOddChar(str);
    }

    private static void everyEvenOddChar(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i <= sb.length()-1; i++) {
            char ch = sb.charAt(i);
            if(i%2 != 0){
                sb.setCharAt(i,sb.charAt(ch+1));
            }
            else{
                sb.setCharAt(i,sb.charAt(ch-1));
            }
        }
        System.out.println(sb);
    }
}
