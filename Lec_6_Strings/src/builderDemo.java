import java.util.Scanner;

public class builderDemo {
    public static void main(String[] args) {
        //Taking Inputs
        Scanner scn = new Scanner(System.in);

        // converting string to String Builder
        String s = scn.nextLine();

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("abc");
        System.out.println(sb);
        sb.charAt(1);
        System.out.println(sb);
        sb.setCharAt(2,'a');
        sb.insert(2,"xy");
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(sb.length(), 'd');
        System.out.println(sb);

        //Changing string builder to string
        String str = sb.toString();
    }
}
