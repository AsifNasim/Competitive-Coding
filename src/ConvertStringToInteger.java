import java.util.Scanner;

public class ConvertStringToInteger {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        int ans = Integer.parseInt(str);
        System.out.println(ans);
    }
}
