import java.util.Scanner;

public class Ques_5_InsertBetween {
    /* Take as input S, a string. Write a function that inserts between each pair of
    characters the difference between their ascii codes. Print the value returned*/
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();

        /*StringBuilder ans*/ insertBetween(str);
//        System.out.println(ans);
    }

    private static void insertBetween(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <= sb.length()+1; i+=2) {
            char ch = sb.charAt(i);
            char ch1 = sb.charAt(i+1);
            sb.insert(i+1,(int)(ch1-ch));
        }
        System.out.println(sb);
    }

}
